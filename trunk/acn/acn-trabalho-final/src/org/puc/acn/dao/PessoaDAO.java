package org.puc.acn.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.puc.acn.dominio.Pessoa;

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
        return this.executarSelect("SELECT * FROM Pessoa order by codigo desc");
    }
    
    public Pessoa recuperar(int id) {
        List<Pessoa> result = this.executarSelect("SELECT * FROM Pessoa where id = " + id);
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
                sql = "Update Pessoa SET " +
                		" codigo = '" + pessoa.getCodigo() + "' " +
                		" nome = '" + pessoa.getNome() + "', " +
                        " WHERE id = " + pessoa.getId();
            }
        }
        else {
            sql = ("INSERT INTO Pessoa (codigo, nome) " +
                    "VALUES ( " +
                    + pessoa.getCodigo() + ", " +
                    "'" + pessoa.getNome() + "')");
        }
        // System.out.println(sql);
        long t1 = System.currentTimeMillis();
        super.executarUpdate(sql);
        tempoInsert += System.currentTimeMillis() - t1;
    }
	
	public void salvarLista(List<Pessoa> lista) {
		List<String> sqlResult = new ArrayList<String>();
		for (Pessoa pessoa : lista) {
	        String sql = "";
	        if(pessoa.getId() != 0) {
	            Pessoa p1 = recuperar(pessoa.getId());
	            if( p1 != null ) {
	                sql = "Update Pessoa SET " +
	                		" codigo = '" + pessoa.getCodigo() + "' " +
	                		" nome = '" + pessoa.getNome() + "', " +
	                        " WHERE id = " + pessoa.getId();
	            }
	        }
	        else {
	            sql = ("INSERT INTO Pessoa (codigo, nome) " +
	                    "VALUES ( " +
	                    + pessoa.getCodigo() + ", " +
	                    "'" + pessoa.getNome() + "')");
	        }
	        sqlResult.add(sql);
		}
        // System.out.println(sql);
        long t1 = System.currentTimeMillis();
        super.executarUpdate(sqlResult);
        tempoInsert += System.currentTimeMillis() - t1;
    }

    public void remover(int id) {
    	super.remover("Pessoa", id);
    }
	
	@SuppressWarnings("resource")
	public void preencherTabela(int tamanho) {
		try {
			String sql = "DELETE FROM Pessoa";
			executarUpdate(sql);

			URL url = this.getClass().getResource("pessoas.txt");
    		BufferedReader in;
			if (url.getProtocol().equals("jar")) {
				// InputStream input = this.getClass().getResourceAsStream("pessoas.txt"); 
				in = new BufferedReader(new FileReader("pessoas.txt")); 
			} else {
				in = new BufferedReader(new FileReader(url.getPath()));
			} 
			
			List<Pessoa> lista = new ArrayList<Pessoa>();
			
			int index = 0;
			while (in.ready() && index < tamanho) {
				String linha = in.readLine();
				String[] array = linha.split(":");
				String codigo = array[0];
				String nome = array[1];
				
				Pessoa pessoa = new Pessoa(0, new Integer(codigo), nome);
				//salvar(pessoa);
				
				lista.add(pessoa);
				
				index++;
			}
			
			salvarLista(lista);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		PessoaDAO p = new PessoaDAO();
//		p.preencherTabela(2000);
//		
//		List<Pessoa> lista = p.recuperar();
//		System.out.println("Tamanho: " + lista.size());
//		
//		System.out.println("Tempo Sel: " + p.getTempoSelect());
//		System.out.println("Tempo Ins: " + p.getTempoInsert());
//	}
	
}
