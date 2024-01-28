package org.example.Servis;

import org.example.Dto.request.AddTeacherRequest;
import org.example.Dto.response.GetStudentsResponce;
import org.example.Dto.response.GetTeachersResponce;
import org.example.Entity.Student;
import org.example.Entity.Teacher;
import org.example.Mapper.TeacherMapper;
import org.example.Repository.TeacherRepository;
import org.example.Util.IdGeneratorUtil;

import java.util.List;

public class TeacherServis {
    private final TeacherRepository teacherRepository = new TeacherRepository();
    private final TeacherMapper teacherMapper = new TeacherMapper();
    public void AddTeacher(AddTeacherRequest request){
        Teacher teacher=teacherMapper.toTeacher(request);
        teacher.setTeacherId(IdGeneratorUtil.getNewTeachertId());
        teacherRepository.AddTeacher(teacher);

    }
    public List<GetTeachersResponce> getAllTeacher(){
        List<Teacher>teachers = teacherRepository.getAllTeachers();
        return teacherMapper.toGetTeacherResponceList(teachers);
    }
}
