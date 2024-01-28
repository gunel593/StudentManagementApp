package org.example.Repository;

import org.example.Entity.Student;

import java.util.*;

public class StudentRepository {
    private static final Map<Long,Student> students1= new HashMap<>();
    public void addStudent(Student student){

        students1.put(student.getId(),student);

    }
    public Student getStudentById(Long id){
        Student student= students1.get(id);
       return student;
    }
    public List<Student>getAllStudents(){

       return new ArrayList<>(students1.values());
    }
}
