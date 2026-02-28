package Hospital;

import Hospital.Service.BillingService;
import Hospital.Service.HospitalService;
import Hospital.models.*;

import java.util.List;
import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HospitalService hospital = new HospitalService();
        BillingService billing = new BillingService(hospital);

        // Sample Rooms
        hospital.addRoom(new Room(101, "General", 1000));
        hospital.addRoom(new Room(102, "ICU", 3000));

        while (true) {

            System.out.println("\n===== HOSPITAL SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Allocate Room");
            System.out.println("3. Add Medical Record");
            System.out.println("4. Add Test");
            System.out.println("5. Generate Bill");
            System.out.println("6. View Available Rooms");
            System.out.println("7. View Patients");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                // ADD PATIENT
                case 1 -> {

                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    System.out.print("Name: ");
                    String name = sc.next();

                    System.out.print("Age: ");
                    int age = sc.nextInt();

                    System.out.print("Phone: ");
                    String phone = sc.next();

                    hospital.addPatient(
                            new Patient(id, name, age, phone)
                    );
                }

                // ALLOCATE ROOM
                case 2 -> {

                    System.out.print("Patient ID: ");
                    int id = sc.nextInt();

                    hospital.allocateRoom(id);
                }

                // ADD MEDICAL RECORD
                case 3 -> {

                    System.out.print("Record No: ");
                    int recNo = sc.nextInt();

                    System.out.print("Patient ID: ");
                    int id = sc.nextInt();

                    System.out.print("Diagnosis: ");
                    String diag = sc.next();

                    hospital.addMedicalRecord(
                            new MedicalRecord(recNo, id, diag)
                    );
                }

                // ADD TEST
                case 4 -> {

                    System.out.print("Report No: ");
                    int r = sc.nextInt();

                    System.out.print("Patient ID: ");
                    int id = sc.nextInt();

                    System.out.print("Test Name: ");
                    String t = sc.next();

                    System.out.print("Cost: ");
                    double c = sc.nextDouble();

                    System.out.print("Result: ");
                    String res = sc.next();

                    hospital.addTestRecord(
                            new TestRecord(r, id, t, c, res)
                    );
                }

                // GENERATE BILL
                case 5 -> {

                    System.out.print("Bill No: ");
                    int b = sc.nextInt();

                    System.out.print("Patient ID: ");
                    int id = sc.nextInt();

                    double testCharge =
                            hospital.getTotalTestCharge(id);

                    billing.generateBill(b, id, 1000, testCharge);
                }

                // VIEW AVAILABLE ROOMS
                case 6 -> {

                    List<Room> rooms =
                            hospital.getAvailableRoom();

                    if (rooms.isEmpty()) {
                        System.out.println("No rooms available.");
                    } else {

                        System.out.println("Available Rooms:");

                        for (Room r : rooms) {
                            System.out.println(
                                    "Room No: " + r.getRoomNo()
                            );
                        }
                    }
                }

                // VIEW PATIENTS
                case 7 -> {

                    hospital.showAllPatients();
                }

                // EXIT
                case 0 -> {

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);
                }

                default -> {
                    System.out.println("Invalid Choice!");
                }
            }
        }
    }
}