package hu.progmasters.customer;

public class Address {

    private String town;
    private String street;
    private int houseNumber;

    public Address(String town, String street, int houseNumber) {
        this.town = town;
        this.street = street;
        if (houseNumber < 0) {
            this.houseNumber = 0;
        } else {
            this.houseNumber = houseNumber;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        if (houseNumber < 0) {
            this.houseNumber = 0;
        } else {
            this.houseNumber = houseNumber;
        }
    }
}
