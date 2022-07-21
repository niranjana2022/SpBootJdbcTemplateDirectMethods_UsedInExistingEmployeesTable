package com.eidiko.niranjana.dao;

import java.util.List;
import java.util.Map;

import com.eidiko.niranjana.entity.Employees;

public interface EmployeeDAO {
	
	public int countEmplyeesDetails(); //USING queryForObject METHOD, required class and vargs
	
	public Employees getEmployeesNameByNo(int no); //USING queryForObject METHOD, BeanPropertyRowMapper.newInstance and vargs
	
	public Map<String,Object> getEmployeesDetailsByNo(int no); //USING queryForMap METHOD, vargs and no required class
	
	public List<Map<String, Object>> getEmployeesDetailsByDesg(String desg1, String desg2); //USING queryForList METHOD, vargs and no required class
	
}
