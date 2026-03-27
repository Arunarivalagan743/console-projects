package fooddelivery;

public final class Address {
    private final int addressId;
    private final int userId;
    private final String pincode;
    private final String city;

    public Address(int addressId, int userId, String pincode, String city) {
        this.addressId = addressId;
        this.userId = userId;
        this.pincode = pincode;
        this.city = city;
    }

    public int getAddressId() {
        return addressId;
    }

    public int getUserId() {
        return userId;
    }

    public String getPincode() {
        return pincode;
    }

    public String getCity() {
        return city;
    }
}
