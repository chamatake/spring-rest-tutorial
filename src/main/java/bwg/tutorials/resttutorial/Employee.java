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
    private String name;
    private String role;

    Employee() {} // empty constructor for the sake of JPA
    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
                && Objects.equals(this.name, tempEmployee.name)
                && Objects.equals(this.role, tempEmployee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Employee{")
                .append("id=")
                .append(this.id)
                .append(", name='")
                .append(this.name)
                .append("\'")
                .append(", role='")
                .append(this.role)
                .append("\'")
                .append("}")
                .toString();
    }
}
