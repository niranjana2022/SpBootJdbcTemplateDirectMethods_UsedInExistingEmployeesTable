package com.eidiko.niranjana.service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
	
	public int fetchEmployeesCountDetails();
	
	public String fetchEmployeesNameByNo(int no);
	
	public Map<String,Object> fetchEmployeesDetailsByNo(int no);
	
	public List<Map<String,Object>> fetchEmployeesDetailsByDesg(String desg1,String desg2);
	

}
