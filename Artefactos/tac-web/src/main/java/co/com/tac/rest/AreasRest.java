package co.com.tac.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/areas")
public class AreasRest {
	@GET
	public String getHola(){
		return "hola";
	}
}
