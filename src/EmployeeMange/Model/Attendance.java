package EmployeeMange.Model;

public class Attendance {
   private int totalWorkingDays;
    private int daysPresent;

    public Attendance(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
        this.daysPresent = 0;
    }

    public void markPresent() {
        daysPresent++;
    }

    public double getAttendanceRatio() {
        return (double) daysPresent / totalWorkingDays;
    }


}