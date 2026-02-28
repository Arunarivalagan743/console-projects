package Hospital.models;

public class TestRecord {

    private int reportNo;
    private int patientId;
    private String testName;
    private double cost;
    private String result;

    public TestRecord(int reportNo,
                      int patientId,
                      String testName,
                      double cost,
                      String result) {

        this.reportNo = reportNo;
        this.patientId = patientId;
        this.testName = testName;
        this.cost = cost;
        this.result = result;
    }

    public int getPatientId() {
        return patientId;
    }

    public double getCost() {
        return cost;
    }

}