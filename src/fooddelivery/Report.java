package fooddelivery;

import java.time.LocalDateTime;
import java.util.List;

public final class Report {
    private final int reportId;
    private final String pincode;
    private final String type;
    private final String summary;
    private final LocalDateTime generatedAt;

    private Report(int reportId, String pincode, String type, String summary, LocalDateTime generatedAt) {
        this.reportId = reportId;
        this.pincode = pincode;
        this.type = type;
        this.summary = summary;
        this.generatedAt = generatedAt;
    }

    public static Report analyzeByPincode(
            int reportId,
            String pincode,
            String type,
            List<Customer> customers,
            List<Restaurant> restaurants,
            List<DeliveryBoy> deliveryBoys
    ) {
        String summary = "Customers=" + customers.size()
                + ", Restaurants=" + restaurants.size()
                + ", DeliveryBoys=" + deliveryBoys.size();
        return new Report(reportId, pincode, type, summary, LocalDateTime.now());
    }

    public int getReportId() {
        return reportId;
    }

    public String getPincode() {
        return pincode;
    }

    public String getType() {
        return type;
    }

    public String getSummary() {
        return summary;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }
}
