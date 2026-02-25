package Hospital.models;

public abstract class Employee {
    protected  int empId;
    protected String name;
    protected double salary;
    protected  String phone;

    Employee(int empId,String name,double salary,String phone)
    {
        this.empId = empId;
        this.name  = name;
        this.salary = salary;
        this.phone =  phone;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
