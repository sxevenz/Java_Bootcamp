package Mod10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Anna", 28, "Engineer", "Accenture", 00.0);
        Employee emp2 = new Employee("George", 32, "Developer", "Google", 00.0);
        Employee emp3 = new Employee("John", 26, "Designer", "Google", 00.0);
        Employee emp4 = new Employee("Stacy", 35, "Manager", "Microsoft", 00.0);
        Employee emp5 = new Employee("Arturs", 29, "Analyst", "Accenture", 00.0);


        List<Employee> empList = new  ArrayList();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        System.out.println("The Employee whose salary is the highest "+ Employee.getHighestPaidEmp(empList));
        }


}
