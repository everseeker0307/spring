package com.everseeker.spring.jersey.action;

import com.everseeker.spring.jersey.config.IOC;
import com.everseeker.spring.jersey.entity.Essay;
import com.everseeker.spring.jersey.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by everseeker on 16/7/26.
 */
@Path("/essay")
public class EssayAction {

    private EssayService essayService = (EssayService) IOC.getBean("essayService");

    @GET
    @Path("{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public Essay getEssayByTitle(@PathParam("title") String title) {
        return essayService.getEssayByTitle(title);
    }
}
