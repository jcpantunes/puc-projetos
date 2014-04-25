package puc.pf.portal.domain;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public static String retornaDataString(Date data) {
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", new Locale("pt", "BR"));
        return sdf.format(data);
    }
    
    public static Date retornaDataDate(String data) {
    	try {
    		return DateFormat.getInstance().parse(data);
    	} catch (ParseException e) {
    		return Calendar.getInstance().getTime();
    	}
    }

}
