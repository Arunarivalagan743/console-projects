package EmployeeMange.Model;

public class Employee {

    private int empId;
    String name;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    double baseSalary;
    Department department;
    Attendance attendance;

    public Employee(int empId, String name, double baseSalary, Department department) {
        this.empId = empId;
        this.name = name;
        this.baseSalary = baseSalary;
        this.department = department;
        this.attendance = new Attendance(30); // assume 30 working days
    }
}