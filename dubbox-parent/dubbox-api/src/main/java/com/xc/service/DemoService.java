package com.xc.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.xc.entity.User;

@Path("demo")
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface  DemoService {
	public String helloDubbox(); 
	
	@GET
    @Path("{uid}")
    public User getUserById(@PathParam("uid")String userid);
}
