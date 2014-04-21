package com.puc.acn.server.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.puc.acn.client.dominio.Pessoa;
import com.puc.acn.server.util.MockUtil;

public class PessoaDAO extends BaseDAO {

	private Long tempoSelect = 0l;
	
	private Long tempoInsert = 0l;
	
	public Long getTempoInsert() {
		return tempoInsert;
	}
	
	public Long getTempoSelect() {
		return tempoSelect;
	}
	
	public List<Pessoa> executarSelect(String sql)
    {
        List<Pessoa> result = new ArrayList<Pessoa>();
        try 
        {
        	long t1 = System.currentTimeMillis();
            this.criarConexao();
            ResultSet rs = stmt.executeQuery(sql);
            tempoSelect += System.currentTimeMillis() - t1;
            if( rs != null ) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    int codigo = rs.getInt("codigo");
                    String nome = rs.getString("nome");

                    Pessoa p = new Pessoa(id, codigo, nome);
                    result.add(p);
                }
            } 
            t1 = System.currentTimeMillis();
            this.fecharConexao();
            tempoSelect += System.currentTimeMillis() - t1;
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public List<Pessoa> recuperar() {
        return this.executarSelect("SELECT * FROM pessoa order by codigo desc");
    }
    
    public Pessoa recuperar(int id) {
        List<Pessoa> result = this.executarSelect("SELECT * FROM pessoa where id = " + id);
        if(result.size() > 0) {
            return (Pessoa)result.get(0);
        }
        return null;
    }
	
	public void salvar(Pessoa pessoa) {
        String sql = "";
        if(pessoa.getId() != 0) {
            Pessoa p1 = recuperar(pessoa.getId());
            if( p1 != null ) {
                sql = "Update pessoa SET " +
                		" codigo = '" + pessoa.getCodigo() + "' " +
                		" nome = '" + pessoa.getNome() + "', " +
                        " WHERE id = " + pessoa.getId();
            }
        }
        else {
            sql = ("INSERT INTO pessoa (codigo, nome) " +
                    "VALUES ( " +
                    + pessoa.getCodigo() + ", " +
                    "'" + pessoa.getNome() + "')");
        }
        long t1 = System.currentTimeMillis();
        super.executarUpdate(sql);
        tempoInsert += System.currentTimeMillis() - t1;
    }

	public void salvar(List<Pessoa> lista) {
		List<String> sqlResult = new ArrayList<String>();
		for (Pessoa pessoa : lista) {
	        String sql = "";
	        if(pessoa.getId() != 0) {
	            Pessoa p1 = recuperar(pessoa.getId());
	            if( p1 != null ) {
	                sql = "Update pessoa SET " +
	                		" codigo = '" + pessoa.getCodigo() + "' " +
	                		" nome = '" + pessoa.getNome() + "', " +
	                        " WHERE id = " + pessoa.getId();
	            }
	        }
	        else {
	            sql = ("INSERT INTO pessoa (codigo, nome) " +
	                    "VALUES ( " +
	                    + pessoa.getCodigo() + ", " +
	                    "'" + pessoa.getNome() + "')");
	        }
	        sqlResult.add(sql);
		}
        long t1 = System.currentTimeMillis();
        super.executarUpdate(sqlResult);
        tempoInsert += System.currentTimeMillis() - t1;
		
    }

    public void remover(int id) {
    	super.remover("pessoa", id);
    }
	
	public void preencherTabela(int quantidade) {
		String sql = "DELETE FROM pessoa";
		executarUpdate(sql);
		
		List<Pessoa> lista = MockUtil.recuperarListaSQLInsert();
		if (quantidade  < lista.size()) {
			lista = lista.subList(0, quantidade);
		}
		salvar(lista);
	}
	
//	public static void main(String[] args) throws Exception {
//		PessoaDAO dao = new PessoaDAO();
//		// dao.preencherTabela();
//		
////		List<Pessoa> lista = dao.recuperar();
////		for (Pessoa p : lista) {
////			System.out.println(p.getCodigo() + " / " + p.getNome());
////		}
////		
////		System.out.println("Tempo Sel: " + dao.getTempoSelect());
////		System.out.println("Tempo Ins: " + dao.getTempoInsert());
//		
//	}
	
}
