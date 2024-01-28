package org.example.Mapper;

import org.example.Dto.request.AddTeacherRequest;
import org.example.Dto.response.GetStudentsResponce;
import org.example.Dto.response.GetTeachersResponce;
import org.example.Entity.Student;
import org.example.Entity.Teacher;
import org.example.Util.DateUtil;

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
