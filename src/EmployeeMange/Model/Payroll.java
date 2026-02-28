package EmployeeMange.Model;

class Payroll {

    public double calculateSalary(Employee emp) {
        double attendanceRatio = emp.attendance.getAttendanceRatio();
        return emp.baseSalary * attendanceRatio;
    }

    public void generatePayslip(Employee emp) {
        double salary = calculateSalary(emp);
        System.out.println("------ PAYSLIP ------");
        System.out.println("Employee: " + emp.name);
        System.out.println("Department: " + emp.department.getDeptName());
        System.out.println("attendance" + emp.attendance.getAttendanceRatio());
        System.out.println("Final Salary: " + salary);
        System.out.println("---------------------");
    }
}