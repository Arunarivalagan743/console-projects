package Hospital;

import Hospital.models.Bill;
import Hospital.models.Doctor;
import Hospital.models.Patient;
import Hospital.models.Room;

public class Main {

    public static void main(String[] args) {

        Doctor doc = new Doctor(
                1,
                "Dr. Arun",
                80000,

                "9876543210",

                "Cardiology"
        );

        Patient p1 = new Patient(
                101,
                "Ravi",
                25,
                "999888777"
        );

        Room room = new Room(201, "ICU", 3000);

        room.occupy();

        Bill bill = new Bill(1, 101, 5000);

        System.out.println("Doctor: " + doc.getName());
        System.out.println("Patient: " + p1.getName());
        System.out.println("Bill Amount: " + bill.getAmount());
    }
}