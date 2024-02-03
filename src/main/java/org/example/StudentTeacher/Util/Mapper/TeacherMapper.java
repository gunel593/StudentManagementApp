package org.example.StudentTeacher.Util.Mapper;

import org.example.StudentTeacher.Util.Dto.request.AddTeacherRequest;
import org.example.StudentTeacher.Util.Dto.response.GetTeachersResponce;
import org.example.StudentTeacher.Util.Entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherMapper {
    public Teacher toTeacher(AddTeacherRequest addTeacherRequest) {
        Teacher teacher = new Teacher();
        teacher.setName(addTeacherRequest.getName());
        teacher.setSurname(addTeacherRequest.getSurname());
        return teacher;
    }

    public List<GetTeachersResponce> toGetTeacherResponceList(List<Teacher> teacherList) {
        List<GetTeachersResponce> getTeachersResponceList = new ArrayList<>();
        for (Teacher teacher : teacherList) {
            GetTeachersResponce getTeachersResponce = new GetTeachersResponce();
            getTeachersResponce.setTeacherId(teacher.getTeacherId());
            getTeachersResponce.setName(teacher.getName());
            getTeachersResponce.setSurname(teacher.getSurname());

            getTeachersResponceList.add(getTeachersResponce);
        }
        return getTeachersResponceList;
    }
}
