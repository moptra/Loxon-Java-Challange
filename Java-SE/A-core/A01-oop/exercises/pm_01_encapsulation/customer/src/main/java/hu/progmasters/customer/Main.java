package hu.progmasters.customer;

public class Main {

    public static void main(String[] args) {

        Address firstAddress = new Address("Budapest", "Ó utca", 12);
        Address secondAddress = new Address("Doboz", "Petőfi Sándor utca", 12);

        Customer firstCustomer = null;
        Customer secondCustomer = null;
        firstCustomer.setCostumerInfo(1240, "Gizi", firstAddress, "20345");
        secondCustomer.setCostumerInfo(4240, "Béla", secondAddress, "30355","bela@be.la");


        
    }
}
