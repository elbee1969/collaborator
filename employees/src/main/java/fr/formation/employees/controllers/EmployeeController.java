package fr.formation.employees.controllers;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.employees.business.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @PostMapping("/{id")
    public void create(Employee employee) {
	System.out.println(employee);
    }

    @GetMapping()
    public Employee get(@RequestBody @Valid Employee employee) {
	Employee employee1 = new Employee();
	employee.setInternId("A123456");
	employee.setFirstName("Laurent");
	employee.setLastName("Berthelot");
	employee.setBirthDate(LocalDate("1969-05-31"));
	employee.setStartDate(LocalDate("2018-05-31"));
	employee.setSalary(35000D);
	employee.setExitDate(null);
	System.out.println("employee create : " + employee1);
	return employee;
    }

    private LocalDate LocalDate(String string) {
	// TODO Auto-generated method stub
	return null;
    }
}
