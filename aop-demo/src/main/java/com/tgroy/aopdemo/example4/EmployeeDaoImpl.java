package com.tgroy.aopdemo.example4;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDaoImpl  implements EmployeeDao  {

	private static Map<Integer, Employee> employeeMap = new HashMap<>();

	@Override
	@Log
	public Employee getEmployee(int id) {

		if (employeeMap.get(id) != null) {
			return employeeMap.get(id);
		}

		Employee employee = new Employee(id);
		employeeMap.put(id, employee);
		return employee;
	}
}
