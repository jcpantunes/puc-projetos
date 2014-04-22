package puc.pf.portal.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ExcecaoCapturada extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	@Column
	private String tipoExcecao;
	
	@Column(length=2096)
	private String stacktrace;
	
	@Column
	private String ticket;
	
	@Temporal(TemporalType.TIMESTAMP)
    protected Date dataExcecao;
	
	public ExcecaoCapturada() {
		super();
	}
	
	public ExcecaoCapturada(String tipoExcecao, String stacktrace) {
		this.tipoExcecao = tipoExcecao;
		this.stacktrace = stacktrace;
		this.ticket = gerarTicket();
		this.setDataExcecao(); 
	}
	
	public String getTipoExcecao() {
		return tipoExcecao;
	}
	
	public void setTipoExcecao(String tipoExcecao) {
		this.tipoExcecao = tipoExcecao;
	}
	
	public String getStacktrace() {
		return stacktrace;
	}
	
	public void setStacktrace(String stacktrace) {
		this.stacktrace = stacktrace;
		if (stacktrace.length() > 2000) {
			this.stacktrace = this.stacktrace.substring(0, 2000);
		}
	}
	
	public String getTicket() {
		return ticket;
	}
	
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	
	public Date getDataExcecao() {
		return dataExcecao;
	}
	
	public void setDataExcecao() {
		this.dataExcecao = Calendar.getInstance().getTime();
	}
	
	public static String gerarTicket() {
		String letras = "0123456789abcdefghijklmnopqrstuvywxz";
		Random random = new Random();  
		String str = "";  
		for(int i = 0; i < 5; i++ ) {  
		   int index = random.nextInt(letras.length());  
		   str += letras.substring(index, index+1);  
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(Calendar.getInstance().getTime()).concat(str);
	}

}