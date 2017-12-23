package org.services.mq.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

@Component
@Provider
@Path("/message")
public class MQController {

	@GET
	@Path("{messageKey}/getMessage.msg")
	// @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,
	// MediaType.APPLICATION_XHTML_XML })
	@Produces(MediaType.APPLICATION_JSON)
	public Object getService(@PathParam("messageKey") String messageKey, @Context HttpServletRequest request,
			@Context HttpServletResponse response) {
		return "success";
	}

	@POST
	@Path("{messageKey}/getMessage.msg")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Object postService(@PathParam("messageKey") String messageKey, @Context HttpServletRequest request,
			@Context HttpServletResponse response) {
		return "success";
	}

}
