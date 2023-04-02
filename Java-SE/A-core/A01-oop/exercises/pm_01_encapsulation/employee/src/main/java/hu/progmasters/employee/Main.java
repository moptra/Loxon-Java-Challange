package hu.progmasters.employee;

public class Main {
    public static void main(String[] args) {

        Employee firstEmployee = new Employee("Béla", "Kiss", 1);
        Employee secondEmployee = new Employee("Gizi", "Nagy", 2);

        System.out.println(firstEmployee.countYearlySalary());
        System.out.println(secondEmployee.countYearlySalary());

        System.out.println(firstEmployee.raiseYearlySalaryWithTenPercent());
        System.out.println(secondEmployee.raiseYearlySalaryWithTenPercent());
    }
}
