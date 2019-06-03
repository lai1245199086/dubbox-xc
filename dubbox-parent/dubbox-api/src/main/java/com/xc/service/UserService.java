package com.xc.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.xc.entity.User;
@Path("user")
//@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
//@Produces({"application/json; charset=UTF-8", "text/xml; charset=UTF-8"})
public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
	@GET
	@Path("all")
    public List<User> findUserList();
 
    /**
     * 根据Id查询用户
     * @param username
     * @return
     */
	@GET
    @Path("{id}")
    public User findUser(@PathParam("id")Long id);
 
}
