package bwg.tutorials.resttutorial;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String role;

    Employee() {} // empty constructor for the sake of JPA
    Employee(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setName(String name) {
        String[] nameParts = name.split(" ");
        this.firstName = nameParts[0];
        this.lastName = nameParts[1];
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee tempEmployee = (Employee) o;
        return Objects.equals(this.id, tempEmployee.id)
                && Objects.equals(this.firstName, tempEmployee.firstName)
                && Objects.equals(this.lastName, tempEmployee.lastName)
                && Objects.equals(this.role, tempEmployee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Employee{")
                .append("id=")
                .append(this.id)
                .append(", firstName='")
                .append(this.firstName)
                .append("\'")
                .append(", lastName='")
                .append(this.lastName)
                .append("\'")
                .append(", role='")
                .append(this.role)
                .append("\'")
                .append("}")
                .toString();
    }
}
