package Hospital.models;

public class Receptionist extends Employee{
    private String deskNo;
    Receptionist(int empId,String name,double salary,String phone, String deskNo){
        super(empId, name, salary, phone);
        this.deskNo = deskNo;
    }
    public String getDeskNo() {
        return deskNo;
    }

    public void setDeskNo(String deskNo) {
        this.deskNo = deskNo;
    }
}
