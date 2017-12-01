package fr.insee.demo.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import fr.insee.demo.model.HelloWorld;

@Component
@Path("/messaging")
public class Messaging {
	
	@GET
	@Path("message")
	@Produces(MediaType.TEXT_HTML)
	public String getMessage() throws Exception {
		HelloWorld hello = new HelloWorld("Hey !");
		return hello.getMessage();
	}
	
}
