package Hospital.Imple;

import Hospital.Service.PatientService;
import Hospital.models.Patient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PatientServiceImpl implements PatientService {
    private HashMap<Integer,Patient> patientHashMap = new HashMap<>();
    @Override
    public void addPatient(Patient patient) {
        patientHashMap.put(patient.getPatientId(),patient);
    }

    @Override
    public Patient getPatientById(int id) {
        return patientHashMap.get(id);
    }

    @Override
    public List<Patient> getAllPatients() {
        return new ArrayList<>(patientHashMap.values());
    }

    @Override
    public void removePatient(int id) {
patientHashMap.remove(id);
    }
}
