package com.eidiko.niranjana.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.niranjana.entity.Employees;
import com.eidiko.niranjana.service.EmployeeService;

@RestController
public class EmployeesController {
	@Autowired
	private EmployeeService empService; 

	@GetMapping("/count")
	public int countEmployeeData() {
		return empService.fetchEmployeesCountDetails();
	}
	
	@GetMapping("/fetchEmployeesNameByNo")
	public String fetchEmployeeDataByEmpNo(@RequestBody Employees employeeId) {
		return empService.fetchEmployeesNameByNo(employeeId.getEmployee_id());
	}
	
	@GetMapping("/fetchEmployeesDetailsByNo")
	public Map<String,Object> fetchEmployeeDetailsByEmpId(@RequestBody Employees employeeId) {
		return empService.fetchEmployeesDetailsByNo(employeeId.getEmployee_id());
	}
	
//	@GetMapping("/fetchEmployeesDetailsByDesg1")   //Using RequestBody(not happens)
//	public List<Map<String,Object>> fetchEmployeeDetailsByEmpDesg1(@RequestBody Employees jobId) {
//		System.out.println("hi");
//		return empService.fetchEmployeesDetailsByDesg(jobId.getJob_id(),jobId.getJob_id());
//	}
	
	@GetMapping("/fetchEmployeesDetailsByDesg") //bY USING REquestParam
	public List<Map<String,Object>> fetchEmployeeDetailsByEmpDesg(@RequestParam("desg1") String jobId, @RequestParam("desg2") String jobIdd) {
		System.out.println("hi");
		return empService.fetchEmployeesDetailsByDesg(jobId,jobIdd);
	}
	
	@GetMapping("/fetchEmployeesDetailsByDesg3/{desg1}/{desg2}") //By using pathVariable
	public List<Map<String,Object>> fetchEmployeeDetailsByEmpDesg3(@PathVariable(name="desg1") String jobId, @PathVariable(name="desg2") String jobIdd) {
		System.out.println("hi");
		return empService.fetchEmployeesDetailsByDesg(jobId,jobIdd);
	}
}
