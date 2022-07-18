package com.eidiko.niranjana.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
	
	public int countEmplyeesDetails();
	
	public String getEmployeesNameByNo(int no);
	
	public Map<String,Object> getEmployeesDetailsByNo(int no);
	
	public List<Map<String, Object>> getEmployeesDetailsByDesg(String desg1, String desg2);
	
}
