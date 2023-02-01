package bwg.tutorials.resttutorial.repository;

import bwg.tutorials.resttutorial.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
