package Hospital.models;

public class Doctor extends Employee{
    private String specialization;
     public Doctor(int empId, String name, double salary, String phone, String specialization)
     {
         super(empId,name,salary,phone);
         this.specialization =  specialization;
     }



    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }
}
