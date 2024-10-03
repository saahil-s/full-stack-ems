package net.javaguides.ems.repository;
// This class extends JpaRepository to get CRUD methods
// to perform CRUD database operations on the Employee JPA entity
import net.javaguides.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
