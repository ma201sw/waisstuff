package hello;

import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@RestController
public class HelloController {

	@Autowired
	private TestService testService;
	
    @RequestMapping("/")
    @ResponseBody
    public String index() {
    	JSONObject obj = new JSONObject();
		obj.put("success", false);
	    obj.put("message", "PEBKACb");
		
		return obj.toString();
		
//		deserialization
//		org.json.JSONObject obj = new org.json.JSONObject(responseAsString);  
//		obj.optBoolean("success"); // false
//		obj.optString("message"); // PEBKACasdf
		
        //return "Greetings from Spring Boot!";
    	//return Response.status(Response.Status.NOT_FOUND).entity("Entity not found for UUID: " + uuid).build();

    	//return Response.ok("test", MediaType.TEXT_PLAIN_VALUE).build();
    }
    
    @RequestMapping("/greeting")
    @ResponseStatus(HttpStatus.OK)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(1,name);
    }

}