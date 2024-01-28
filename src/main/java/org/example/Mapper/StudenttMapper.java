package org.example.Mapper;

import org.example.Dto.request.AddStudentRequest;
import org.example.Dto.response.GetStudentsResponce;
import org.example.Entity.Student;
import org.example.Util.DateUtil;

import java.util.ArrayList;
import java.util.List;

public class StudenttMapper {
    public Student toStudent(AddStudentRequest addStudentRequest){
        Student student= new Student();
        student.setName(addStudentRequest.getName());
        student.setSurname(addStudentRequest.getSurname());
        student.setBirthday(DateUtil.toLocalDate(addStudentRequest.getBirthday()));

        return student;
    }
    public List<GetStudentsResponce>toGetStudentsResponceList (List<Student>studentList){
        List<GetStudentsResponce>getStudentsResponceList = new ArrayList<>();
        for( Student student: studentList){
            GetStudentsResponce getStudentsResponce = new GetStudentsResponce();
            getStudentsResponce.setId(student.getId());
            getStudentsResponce.setSurname(student.getName());
            getStudentsResponce.setBirthday(
                    DateUtil.toString(
                            student.getBirthday()
                    )

            ) ;
            getStudentsResponceList.add(getStudentsResponce);
        }
        return getStudentsResponceList;
    }
}
