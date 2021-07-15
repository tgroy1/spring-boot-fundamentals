package com.tgroy.aopdemo.example5;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service("employeeDao")
public class EmployeeDaoImpl  implements EmployeeDao  {

	private static Map<Integer, Employee> employeeMap = new HashMap<>();

	@Override
	public Employee getEmployee(int id) {

		if (employeeMap.get(id) != null) {
			return employeeMap.get(id);
		}
		
		if (id < 1) {
			throw new RuntimeException("Incorrect id");
		}

		Employee employee = new Employee(id);
		employeeMap.put(id, employee);
		return employee;
	}
}
