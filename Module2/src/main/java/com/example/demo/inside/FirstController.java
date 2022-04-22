/**
 * 
 */
package com.example.demo.inside;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.ErrorConstants;
import com.example.demo.dto.Employee;
import com.example.demo.exception.EmployeeNotFoundException;

/**
 * @author Tejora
 *
 */
@RestController
public class FirstController {
	
	
	@RequestMapping(value = "/view")
	public Employee show(HttpServletResponse res)  {

		//System.out.println("i am from show sysout");
		//res.sendRedirect("welcome.jsp");
		 //res.sendRedirect("https://www.google.com");
		
		try {
		//int a = 1/0;
		}
		
		catch(Exception ex)
		{
					//ex.printStackTrace();
				System.out.println(ErrorConstants.EMPLOYEE_NOT_FOUND1.getMessage());
					throw new EmployeeNotFoundException(ErrorConstants.EMPLOYEE_NOT_FOUND1.getMessage());
		}
		
		return new Employee();
		
		
	}

	
}
