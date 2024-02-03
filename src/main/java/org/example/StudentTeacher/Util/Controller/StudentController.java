package org.example.StudentTeacher.Util.Controller;

import org.example.StudentTeacher.Util.Dto.request.AddStudentRequest;
import org.example.StudentTeacher.Util.Dto.response.GetStudentsResponce;
import org.example.StudentTeacher.Util.Servis.StudentServis;

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
