package springbootcrud.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootcrud.rest.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
