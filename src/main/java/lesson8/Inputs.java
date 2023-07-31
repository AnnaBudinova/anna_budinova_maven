package lesson8;

public class Inputs {
    public static void main(String[] args) {
        Employee employee = new Employee("564","Anna", "Budinova", 2000);
        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.getRaiseSalary(5.5));
        System.out.println(employee.toString());
    }
}
