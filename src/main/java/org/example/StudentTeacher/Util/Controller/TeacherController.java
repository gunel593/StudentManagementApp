package org.example.StudentTeacher.Util.Controller;

import org.example.StudentTeacher.Util.Dto.request.AddTeacherRequest;
import org.example.StudentTeacher.Util.Dto.response.GetTeachersResponce;
import org.example.StudentTeacher.Util.Servis.TeacherServis;

import java.util.List;

public class TeacherController {
    private final TeacherServis teacherServis = new TeacherServis();
    public void addTeacher(AddTeacherRequest request){
        teacherServis.AddTeacher(request);

    }
    public List<GetTeachersResponce> getAllTeachers(){
        return teacherServis.getAllTeacher();

    }
}
