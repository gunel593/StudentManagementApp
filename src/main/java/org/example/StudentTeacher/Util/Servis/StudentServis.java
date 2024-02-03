package org.example.StudentTeacher.Util.Servis;

import org.example.StudentTeacher.Util.Dto.request.AddStudentRequest;
import org.example.StudentTeacher.Util.Dto.response.GetStudentsResponce;
import org.example.StudentTeacher.Util.Entity.Student;
import org.example.StudentTeacher.Util.Mapper.StudenttMapper;
import org.example.StudentTeacher.Util.Repository.StudentRepository;
import org.example.StudentTeacher.Util.Util.IdGeneratorUtil;

import java.util.List;

public class StudentServis {
    private final StudentRepository studentRepository =new StudentRepository();
    private final StudenttMapper studentMapper =new StudenttMapper();

    public void addStudent(AddStudentRequest request){
        Student student= studentMapper.toStudent(request);
        student.setId(IdGeneratorUtil.getNewStudentId());
        studentRepository.addStudent(student);
    }
    public List<GetStudentsResponce> getAllStudent(){
       List<Student>students = studentRepository.getAllStudents();
       return studentMapper.toGetStudentsResponceList(students);
    }
}
