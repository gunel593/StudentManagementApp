package org.example.Servis;

import org.example.Dto.request.AddStudentRequest;
import org.example.Dto.response.GetStudentsResponce;
import org.example.Entity.Student;
import org.example.Mapper.StudenttMapper;
import org.example.Repository.StudentRepository;
import org.example.Util.IdGeneratorUtil;

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
