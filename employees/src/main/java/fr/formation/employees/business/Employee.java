package fr.formation.employees.business;

import java.time.LocalDate;

public class Employee {

// Comment
    private Long id;

    private String internId;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private LocalDate startDate;

    private Double salary;

    private LocalDate exitDate;

    public Employee(Long id, String internId, String firstName, String lastName,
	    LocalDate birthDate, LocalDate startDate, Double salary,
	    LocalDate exitDate) {
	this.id = id;
	this.internId = internId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.birthDate = birthDate;
	this.startDate = startDate;
	this.salary = salary;
	this.exitDate = exitDate;
    }

    public Employee() {
	// TODO Auto-generated constructor stub
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getInternId() {
	return internId;
    }

    public void setInternId(String internId) {
	this.internId = internId;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
    }

    public LocalDate getStartDate() {
	return startDate;
    }

    public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
    }

    public Double getSalary() {
	return salary;
    }

    public void setSalary(Double salary) {
	this.salary = salary;
    }

    public LocalDate getExitDate() {
	return exitDate;
    }

    public void setExitDate(LocalDate exitDate) {
	this.exitDate = exitDate;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", internId=" + internId + ", firstName="
		+ firstName + ", lastName=" + lastName + ", birthDate="
		+ birthDate + ", startDate=" + startDate + ", salary=" + salary
		+ ", exitDate=" + exitDate + "]";
    }
}
