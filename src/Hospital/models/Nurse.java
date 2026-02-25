package Hospital.models;

public class Nurse extends Employee{
    private String shift;
    Nurse(int empId,String name,double salary,String phone, String shift){
        super(empId, name, salary, phone);
    this.shift = shift;
    }
}
