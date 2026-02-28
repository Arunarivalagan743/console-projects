package EmployeeMange.Service;

import EmployeeMange.Model.Employee;

public interface EmplyeeService {
    void addEmployee(Employee e);



    void removeEmplyee(int id);
     Employee findEmployee(int id);
     void addAttendance(Employee e);
    void display();
}
