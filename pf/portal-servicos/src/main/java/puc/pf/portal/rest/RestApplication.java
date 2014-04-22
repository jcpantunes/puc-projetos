package puc.pf.portal.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class RestApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
	
	public RestApplication() {
		this.singletons.add(new RestServicePortal());
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return this.empty;
	}
	
	public Set<Object> getSingletons() {
		return singletons;
	}
}
