package org.example.Controller;

import org.example.Dto.request.AddStudentRequest;
import org.example.Dto.request.AddTeacherRequest;
import org.example.Dto.response.GetStudentsResponce;
import org.example.Dto.response.GetTeachersResponce;
import org.example.Servis.TeacherServis;

import java.util.List;

public class TeacherController {
    private final TeacherServis teacherServis = new TeacherServis();
    public void addTeacher(AddTeacherRequest request){
        teacherServis.AddTeacher(request);

    }
    public List<GetTeachersResponce> getAllTeacher(){
        return teacherServis.getAllTeacher();

    }
}
