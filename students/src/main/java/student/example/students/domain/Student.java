package student.example.students.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
private String studentname;
private int fee;

public Student(){
    super();
}
    public Student(int id, String studentname, int fee, String course) {
        this.id = id;
        this.studentname = studentname;
        this.fee = fee;
        this.course = course;
    }

    private String course;

    public void setId(long id) {
        this.id = id;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public long getId() {
        return id;
    }

    public String getStudentname() {
        return studentname;
    }

    public int getFee() {
        return fee;
    }

    public String getCourse() {
        return course;
    }
}
