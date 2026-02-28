package Hospital.models;

public class Bill {

    private int billNo;
    private int patientId;
    private double amount;

    public Bill(int billNo, int patientId, double amount) {
        this.billNo = billNo;
        this.patientId = patientId;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}