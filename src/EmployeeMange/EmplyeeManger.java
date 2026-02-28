package EmployeeMange;

import EmployeeMange.Service.EmplyeeService;
import EmployeeMange.Model.Employee;

import java.util.ArrayList;

public class EmplyeeManger implements EmplyeeService {
    ArrayList <Employee> employeeArrayList = new ArrayList<>();

    @Override
    public void addEmployee(Employee e) {
        employeeArrayList.add(e);
    }

    @Override
    public void removeEmplyee(int id) {
        employeeArrayList.removeIf(e -> e.getEmpId() == id);

    }

    @Override
    public Employee findEmployee(int id) {
        for (Employee e : employeeArrayList)
        {
            if (e.getEmpId() == id)
            {
                return  e;
            }
        }
        return null;
    }
    public  void addAttendance(Employee e)
    {
        Employee emp  = findEmployee(e.getEmpId());
        if(emp!=null)
        {
            emp.getAttendance().markPresent();
        }else {
            System.out.println("employee not found");
        }
    }
    public  void display()
    {
        for (Employee emp : employeeArrayList) {
            System.out.println("Employee: " + emp.getName());
            System.out.println("Department: " + emp.getDepartment().getDeptName());
            System.out.println("attendance" + emp.getAttendance().getAttendanceRatio());
            System.out.println("Final Salary: " + emp.getBaseSalary());
            System.out.println("---------------------");
        }
    }
}
