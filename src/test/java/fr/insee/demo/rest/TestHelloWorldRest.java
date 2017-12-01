package fr.insee.demo.rest ;

import static com.jayway.restassured.RestAssured.expect;
import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.MediaType;

import org.junit.Test;

public class TestHelloWorldRest {
	

    @Test
    public void getMessageByRest() {
        
        // Trying to reach http://localhost:8080/javaApi/api/messaging/message with Status = 200
        String message = expect()
                .statusCode(200)
                .contentType(MediaType.TEXT_HTML)
                .when()
                .get("/javaApi/api/messaging/message")
                .body()
                .asString();
        assertEquals(message, "Hey !");
    }

}
