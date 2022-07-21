package com.eidiko.niranjana.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.eidiko.niranjana.entity.Employees;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int countEmplyeesDetails() {
		String countSqlQuery = "select count(*) from EMPLOYEES";
		 return jdbcTemplate.queryForObject(countSqlQuery, Integer.class);
	}

	@Override
	public Employees getEmployeesNameByNo(int no) {
		String retrieveSingleData = "select first_name,last_name from EMPLOYEES where employee_id=?";
		 return jdbcTemplate.queryForObject(retrieveSingleData, BeanPropertyRowMapper.newInstance(Employees.class),no);
	}

	@Override
	public Map<String, Object> getEmployeesDetailsByNo(int no) {
		String retrieveMultipleData = "select employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary from EMPLOYEES where employee_id=?";
		 return jdbcTemplate.queryForMap(retrieveMultipleData, no);
	}

	@Override
	public List<Map<String, Object>> getEmployeesDetailsByDesg(String desg1, String desg2) {
		String retrieveMultipleData1 = "select employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary from EMPLOYEES where job_id in(?,?) order by job_id";
		 return jdbcTemplate.queryForList(retrieveMultipleData1, desg1,desg2);
	}

	
}
