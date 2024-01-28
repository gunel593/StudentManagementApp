package org.example.Controller;

import org.example.Dto.request.AddStudentRequest;
import org.example.Dto.response.GetStudentsResponce;
import org.example.Entity.Student;
import org.example.Repository.StudentRepository;
import org.example.Servis.StudentServis;

import java.util.List;

public class StudentController {
    private  final StudentServis studentServis = new StudentServis();
    public void addStudent(AddStudentRequest request){
        studentServis.addStudent(request);

    }
    public List<GetStudentsResponce> getAllStudents(){
        return studentServis.getAllStudent();

    }
}
