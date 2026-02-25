package Hospital.Service;

import Hospital.models.Patient;

import java.util.List;

public interface PatientService {
    void addPatient(Patient patient);
    Patient getPatientById(int id);
    List <Patient> getAllPatients();
    void removePatient(int id);
}
