package student.example.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.example.students.domain.Student;
import student.example.students.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;
    public List<Student> listAll(){
        return repo.findAll();
    }

    public void save(Student std){
        repo.save(std);
    }

    public Student get(Long id) {
        return repo.findById(id).get();
    }

    public void delet(Long id){
        repo.deleteById(id);
    }

}
