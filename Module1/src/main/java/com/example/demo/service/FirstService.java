/**
 * 
 */
package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Employee;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author Tejora
 *
 */
@Service
public class FirstService {

	private RestTemplate restTemplate = new RestTemplate();
	
	
	@HystrixCommand(fallbackMethod="fallbackMethodmodule2")
	public Employee getPersonDetail(String module2url) {

		Employee e = restTemplate.getForObject(module2url, Employee.class);
		
		return e;
		
	}
	
	public Employee fallbackMethodmodule2(String module2url) {
		
		System.out.println("fall back method invoked");
		Employee e = new Employee();
		e.setFirstName("fall backed mathod firstname");
		return e;
	}
	
	

}
