package puc.pf.portal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Bookmark extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	@Column
	private String description;
	
	@Column
	private String link;
	
	public Bookmark() {
		super();
	}
	
	public Bookmark(String description, String link) {
		this.description = description;
		this.link = link;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}

}
