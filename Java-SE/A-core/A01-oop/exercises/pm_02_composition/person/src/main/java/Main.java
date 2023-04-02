public class Main {

    /*This is a simple example of composition.
     * Where our Person, 'has-an' object 'Address' assigned to it.
     * This tool, can be very useful in such cases where we want to represent
     * real-life hierarchy like this one.
     * */
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setDateOfBirth("1970-01-01");
        person.setPlaceOfBirth("Budapest");

        Address address = new Address();
        address.setCity("Budapest");
        address.setZipCode("1234");
        address.setStreet("Sesame Street");

        person.setAddress(address);
    }

}
