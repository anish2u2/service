package org.services.rest.api.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

@Path("/home.json")
@Component
@Provider
public class HomeController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Object getResponse() {
		System.out.println("Executing");
		Map<String, String> result = new HashMap<String, String>();
		result.put("info", "Welcome!");
		return result;
	}

}
