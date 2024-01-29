import com.engeto.ja.computers.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1=
                new Employee("Karel Dvorak",
                        LocalDate.of(1998,1,13),
                        BigDecimal.ZERO, 321);
        Employee employee2 = new Employee("Jana Mala",
                LocalDate.of(2000, 12, 4));
        Employee employee3 = new Employee("Anna Dvorakova",
                LocalDate.of(1981,2,28));

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        System.out.println("Pocet zamestnancu: "+ employeeList.size());
        for (int i = 0; i < 10; i++) {
            employeeList.add(new Employee("Zamestnanec "+i, LocalDate.of(1990, 1, i)));
        }
        System.out.println("Pocet zamestnancu: " + employeeList.size());
        System.out.println(employeeList.get(0).getName());
        employeeList.clear();
        employee1.setName("Karel");
        System.out.println(employee1.getName());

        employee1.setAccountState(BigDecimal.valueOf(1));
        System.out.println(
            employee1.canBuy(BigDecimal.TWO,5));
    }
}