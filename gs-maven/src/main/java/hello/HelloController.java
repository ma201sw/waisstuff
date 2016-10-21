package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {

	@Autowired
	private TestService testService;
	
    @RequestMapping("/")
    public String index() {
    	JSONObject obj = new JSONObject();
		obj.put("success", false);
	    obj.put("message", "PEBKAC");
		
		return obj.toString();
		
//		deserialization
//		org.json.JSONObject obj = new org.json.JSONObject(responseAsString);  
//		obj.optBoolean("success"); // false
//		obj.optString("message"); // PEBKAC
		
        //return "Greetings from Spring Boot!";
    	//return Response.status(Response.Status.NOT_FOUND).entity("Entity not found for UUID: " + uuid).build();

    	//return Response.ok("test", MediaType.TEXT_PLAIN_VALUE).build();
    }

}