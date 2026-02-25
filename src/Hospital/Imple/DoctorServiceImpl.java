package Hospital.Imple;

import Hospital.Service.DoctorService;
import Hospital.models.Doctor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class DoctorServiceImpl implements DoctorService {
    private HashMap<Integer, Doctor> doctorHashMap = new HashMap<>();

    @Override
    public void addDoctor(Doctor doctor) {
        doctorHashMap.put(doctor.getEmpId(),doctor);
    }

    @Override
    public Doctor getDoctorById(int id) {
        return doctorHashMap.get(id);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return new ArrayList<>(doctorHashMap.values());
    }
}
