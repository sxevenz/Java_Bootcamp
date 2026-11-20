package Mod10;

import java.awt.*;
import java.util.List;

public class Employee extends Person {
    private String jobTitle;
    private String company;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, int age ,String jobTitle) {
        super(name ,age);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int age,String jobTitle, String company, double salary) {
        super(name,age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }
    //setters
    public void setCompany(String company) {
        this.company = company;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }else {
            throw new IllegalArgumentException("Salary cannot be negative");
        }    }
    //getters


    public double getSalary() {
        return salary;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public String getCompany() {
        return company;
    }
    //introduce override
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("I work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }
    public static void main() {
        Employee e = new Employee("Josh", 25,"Manager", "Accenture", 2000);
        e.introduce();
    }
    public static String getHighestPaidEmp(List<Employee> empList){
        if (empList.isEmpty()){
            return "No Employee in the list";
        }
        Employee highestPaid = empList.get(0);
        for (Employee emp : empList) {
            if (emp.getSalary() > highestPaid.getSalary()) {
                highestPaid = emp;
            }
        }
        if (highestPaid.getSalary() > 0) {
            return highestPaid.getName();
        }
        else {
            return "Highest salary is 0 (Every employee has salary of 0) "  ;
        }

}}
