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
}