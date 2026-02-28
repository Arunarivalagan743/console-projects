package Hospital.Service;


import Hospital.models.*;

public class BillingService {

    private HospitalService hospitalService;

    public BillingService(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    public void generateBill(int billNo,
                             int patientId,
                             double roomCharge,
                             double testCharge) {

        double total = roomCharge + testCharge;

        Bill bill = new Bill(billNo, patientId, total);

        hospitalService.addBill(bill);

        System.out.println("Total Amount: ₹" + total);
    }
}