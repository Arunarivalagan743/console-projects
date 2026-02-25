package Hospital.models;

public class Patient {
    private  int patientId;
    private  String name;
    private int age;
    private String Phone;
    public Patient(int patientId, String name, int age, String phone) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        Phone = phone;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
