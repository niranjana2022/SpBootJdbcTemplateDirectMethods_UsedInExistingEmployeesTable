package com.eidiko.niranjana.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eidiko.niranjana.dao.EmployeeDAO;
import com.eidiko.niranjana.entity.Employees;
import com.eidiko.niranjana.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO empDao;
	@Override
	public int fetchEmployeesCountDetails() {
		return empDao.countEmplyeesDetails();
	}
	@Override
	public Employees fetchEmployeesNameByNo(int no) {
		return empDao.getEmployeesNameByNo(no);
	}
	@Override
	public Map<String,Object> fetchEmployeesDetailsByNo(int no) {
		return empDao.getEmployeesDetailsByNo(no);
	}
	@Override
	public List<Map<String, Object>> fetchEmployeesDetailsByDesg(String desg1, String desg2) {
		return empDao.getEmployeesDetailsByDesg(desg1, desg2);
	}
	
}
