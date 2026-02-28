package Hospital.Service;

import Hospital.models.*;

import java.util.ArrayList;
import java.util.List;

public class HospitalService {

    private List<Doctor> doctors = new ArrayList<>();
    private List<Nurse> nurses = new ArrayList<>();
    private List<Receptionist> receptionists = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();
    private List<MedicalRecord> records = new ArrayList<>();
    private List<Bill> bills = new ArrayList<>();
    private List<TestRecord> tests = new ArrayList<>();

    // ================= EMPLOYEE =================

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
        System.out.println("Nurse added successfully.");
    }

    public void addReceptionist(Receptionist receptionist) {
        receptionists.add(receptionist);
        System.out.println("Receptionist added successfully.");
    }

    // ================= PATIENT =================

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    public Patient findPatientById(int id) {

        for (Patient p : patients) {
            if (p.getPatientId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Patient> getAllPatients() {
        return new ArrayList<>(patients);
    }

    // ================= ROOM =================

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getAvailableRoom() {

        List<Room> availableRooms = new ArrayList<>();

        for (Room r : rooms) {
            if (!r.isOccupied()) {
                availableRooms.add(r);
            }
        }

        return availableRooms;
    }

    // ✅ FIXED METHOD
    public boolean allocateRoom(int patientId) {

        Patient patient = findPatientById(patientId);

        if (patient == null) {
            System.out.println("Patient not found.");
            return false;
        }

        List<Room> availableRooms = getAvailableRoom(); // ✅ Get list

        if (availableRooms.isEmpty()) {
            System.out.println("No room available.");
            return false;
        }

        Room room = availableRooms.get(0); // ✅ Take first free room

        room.occupy();

        System.out.println("Room " + room.getRoomNo()
                + " allocated to " + patient.getName());

        return true;
    }

    // ================= MEDICAL RECORD =================
    public void addMedicalRecord(MedicalRecord record) {

        Patient p = findPatientById(record.getPatientId());

        if (p == null) {
            System.out.println("Patient Not Found!");
            return;
        }

        records.add(record);

        System.out.println("Medical Record Added for " + p.getName());
    }

    // ================= BILL =================

    public void addBill(Bill bill) {

        if (findPatientById(bill.getPatientId()) == null) {
            System.out.println("Patient not found.");
            return;
        }

        bills.add(bill);
        System.out.println("Bill generated.");
    }

    public Bill getBillByPatientId(int patientId) {

        for (Bill b : bills) {

            if (b.getPatientId() == patientId) {
                return b;
            }
        }

        return null;
    }

    // ================= TEST =================

    public void addTestRecord(TestRecord test) {

        if (findPatientById(test.getPatientId()) == null) {
            System.out.println("Patient not found.");
            return;
        }

        tests.add(test);

        System.out.println("Test record added.");
    }

    public double getTotalTestCharge(int patientId) {

        double total = 0;

        for (TestRecord t : tests) {

            if (t.getPatientId() == patientId) {
                total += t.getCost();
            }
        }

        return total;
    }

    // ================= DISPLAY =================

    public void showAllPatients() {

        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }

        for (Patient p : patients) {

            System.out.println("------------------");
            System.out.println("ID   : " + p.getPatientId());
            System.out.println("Name : " + p.getName());
            System.out.println("Age  : " + p.getAge());
            System.out.println("Phone: " + p.getPhone());
        }
    }
}