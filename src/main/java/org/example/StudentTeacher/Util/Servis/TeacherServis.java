package org.example.StudentTeacher.Util.Servis;

import org.example.StudentTeacher.Util.Dto.request.AddTeacherRequest;
import org.example.StudentTeacher.Util.Dto.response.GetTeachersResponce;
import org.example.StudentTeacher.Util.Entity.Teacher;
import org.example.StudentTeacher.Util.Mapper.TeacherMapper;
import org.example.StudentTeacher.Util.Repository.TeacherMySqlRepositoryImpl;
import org.example.StudentTeacher.Util.Repository.TeacherRepository;
import org.example.StudentTeacher.Util.Util.IdGeneratorUtil;

import java.util.List;

public class TeacherServis {
    private final TeacherRepository teacherRepository = TeacherMySqlRepositoryImpl.getInstance();
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
