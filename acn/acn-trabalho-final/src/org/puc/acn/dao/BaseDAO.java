package org.puc.acn.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

public abstract class BaseDAO {
	
	// Local
	private String db_url = "jdbc:mysql://localhost:3306/puciec";
    private String db_user = "teste";
    private String db_password = "teste";
    private String db_driver = "com.mysql.jdbc.Driver";
    
	// AWS
//    private String db_url = "jdbc:mysql://ec2-54-232-208-87.sa-east-1.compute.amazonaws.com:3306/puciec";
//    private String db_user = "root";
//    private String db_password = "";
//    private String db_driver = "com.mysql.jdbc.Driver";
    
    
    private Connection conexao = null;
    protected Statement stmt = null;
    protected ResultSet resultSet = null;

    public BaseDAO() {
    	Properties props = new Properties();
        try {
            props.load(new FileReader("banco.properties"));
       } catch (IOException e) {
            e.printStackTrace();
        }
        this.db_url = props.getProperty("url");
        this.db_user = props.getProperty("usuario");
        this.db_password = props.getProperty("senha");
        this.db_driver = props.getProperty("driver");
    }

    protected void criarConexao() {
        try {
            Class.forName(db_driver);
            conexao = DriverManager.getConnection(db_url, db_user, db_password);
            stmt = conexao.createStatement();
        } 
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
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
