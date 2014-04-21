package com.puc.acn.server.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.google.appengine.api.rdbms.AppEngineDriver;

public abstract class BaseDAO {
	
//	private String db_url = "jdbc:mysql://localhost:3306/puciec";
//    private String db_user = "teste";
//    private String db_password = "teste";
//	private String db_driver = "com.mysql.jdbc.Driver";
    
    private String db_url = "jdbc:google:rdbms://jcpantunes-puc-2013-sql/puciec";
    private String db_user = "root";
    private String db_password = "";
    
    private Connection conexao = null;
    protected Statement stmt = null;
    protected ResultSet resultSet = null;

    public BaseDAO() {
    }

    protected void criarConexao() {
        try {
            // Class.forName(db_driver);
            
            DriverManager.registerDriver(new AppEngineDriver());
            conexao = DriverManager.getConnection(db_url, db_user, db_password);
            stmt = conexao.createStatement();

        } 
//        catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    protected void fecharConexao() {
        try {
            if(resultSet != null)
                resultSet.close();
            if (stmt != null ) 
                stmt.close();
            if ( conexao != null )
                conexao.close();
        } 
        catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
    protected void executarUpdate(String sql) {
    	try {
            this.criarConexao();
            stmt.executeUpdate(sql);
            this.fecharConexao();
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    protected void executarUpdate(List<String> sql) {
    	try {
            this.criarConexao();
            for (String str : sql) {
            	stmt.executeUpdate(str);
            }
            this.fecharConexao();
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    protected void remover(String tabela, int id) {
        String sql = "DELETE FROM " + tabela +
                        " WHERE id = " + id;
        executarUpdate(sql);
    }

}
