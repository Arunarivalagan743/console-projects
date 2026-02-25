package Hospital.Service;

import Hospital.models.Doctor;

import javax.print.Doc;
import java.util.List;

public interface DoctorService {
    void addDoctor(Doctor doctor);
    Doctor getDoctorById(int id);
    List<Doctor> getAllDoctors();
}
