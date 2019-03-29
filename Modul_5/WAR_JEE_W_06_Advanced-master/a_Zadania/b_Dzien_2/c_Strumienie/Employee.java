package a_Zadania.b_Dzien_2.c_Strumienie;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthday;
    private BigDecimal salary;


    Employee(String firstName, String lastName, Gender gender, LocalDate birthday, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", salary=" + salary +
                '}';
    }
}
