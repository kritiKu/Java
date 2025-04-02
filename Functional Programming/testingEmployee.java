import java.util.List;

public class testingEmployee {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Prashant", 100),
                new Employee("Kriti", 10000),
                new Employee("Shikha", 10000000)

        );

        employees.stream()
                .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }
}
