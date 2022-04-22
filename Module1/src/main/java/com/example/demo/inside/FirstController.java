/**
 * 
 */
package com.example.demo.inside;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Employee;
import com.example.demo.service.FirstService;

/**
 * @author Tejora
 *
 */
@EnableCircuitBreaker
@RestController
public class FirstController {
	
	@Value("${message}")
	String message;
	
	@Value("${module2URLModified:http://localhost:8762/app2/view}")
	String module2URL;
	
	@Autowired
	private FirstService firstService;
	
	
	
	@RequestMapping(value = "/show")
	public Employee show(HttpServletResponse res) throws IOException {

		System.out.println("i am from show sysout "+message);
		//res.sendRedirect("welcome.jsp");
		// res.sendRedirect("https://www.google.com");
		
		Employee e = firstService.getPersonDetail(module2URL);
		
		System.out.println(module2URL);
		
		return e;
		//return " i am from from Module1 "+;

	}

	
}
