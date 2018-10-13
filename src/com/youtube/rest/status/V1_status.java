package com.youtube.rest.status;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.*;

@Path("/v1/status")
public class V1_status {
	
	private static final String api_version = "00.01.00";
	private static final String api_version = "00.01.00";
	private static final String api_version = "00.01.00";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Java Web Service<p>";		
		
	}

	@Path("/version")
	@GET		
	@Producesttt(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "<p>Version: <p>"+api_version+" "+ new java.util.Date();		
		
	}

}
