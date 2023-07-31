package lesson8;

public class Employee {
    private final String id;
    private final String firstName;
    private final String lastName;
    private double salaryPerMonth;

    public Employee(String id, String firstName, String lastName, double salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public Double getAnnualSalary() {
        return salaryPerMonth * 12;
    }

    public Double getRaiseSalary(Double percentage) {
        salaryPerMonth = salaryPerMonth + (salaryPerMonth * (percentage / 100));
        return salaryPerMonth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}
