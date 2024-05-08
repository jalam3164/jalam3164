package com.curd.curdoperation;

import com.curd.curdoperation.model.Employee;
import com.curd.curdoperation.repository.EmployeeRepo;
import com.curd.curdoperation.service.EmployeeService;
import jakarta.persistence.Column;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class CurdoperationApplicationTests {

	@Autowired
	private EmployeeService employeeService;

	@MockBean
	private EmployeeRepo employeeRepo;

	@Test
	public void getAllEmployeeTest() {
		Mockito.when(employeeRepo.findAll())
				.thenReturn(Stream.of(new Employee(1, "aa", "bb", "ss", "nn"),
								new Employee(2, "bb", "ww", "kk", "mm"))
						.collect(Collectors.toList()));
		Assertions.assertEquals(2,employeeService.getAllEmployee().size());
	}



}
