package student.example.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import student.example.students.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
