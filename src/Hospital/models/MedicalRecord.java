package Hospital.models;

public class MedicalRecord {

    private int recordNo;
    private int patientId;
    private String diagnosis;

    public MedicalRecord(int recordNo,
                         int patientId,
                         String diagnosis) {

        this.recordNo = recordNo;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
    }



    public int getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(int recordNo) {
        this.recordNo = recordNo;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}