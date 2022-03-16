package Essential.DZ_1.Fourth;

public class Address {
    String index, country, city, street, house, apartment;

    public static void main(String[] args) {
        Address address = new Address();
        address.setApartment("Some Aprtmnt");
        address.setCity("Some City");
        address.setCountry("Some Country");
        address.setHouse("Some House");
        address.setStreet("Some Street");
        address.setIndex("Some Index");

        System.out.println("Index is: " + address.getIndex());
        System.out.println("Country is: " + address.getCountry());
        System.out.println("City is: " + address.getCity());
        System.out.println("House is: " + address.getHouse());
        System.out.println("Street is: " + address.getStreet());
        System.out.println("House is: " + address.getHouse());
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
