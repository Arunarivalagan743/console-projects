package EmployeeMange;

import EmployeeMange.Model.Department;
import EmployeeMange.Service.EmplyeeService;
import EmployeeMange.Model.Employee;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(23,"CSE");
        Department department2 = new Department(23,"ECE");
        Employee emp1  =  new Employee(1,"Arun",12345,department);
        Employee emp2 =  new Employee(2,"Hari",12345,department2);
        EmplyeeService emplyeeService =  new EmplyeeManger();
        emplyeeService.addEmployee(emp1);
        emplyeeService.addEmployee(emp2);
     emplyeeService.addAttendance(emp1);
     emplyeeService.display();

    }
}
