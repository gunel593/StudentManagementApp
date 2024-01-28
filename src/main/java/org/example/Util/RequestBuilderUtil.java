package org.example.Util;

import org.example.Dto.request.AddStudentRequest;
import org.example.Dto.request.AddTeacherRequest;
import org.example.Entity.Subjects;

import java.util.Scanner;

public class RequestBuilderUtil {
    private RequestBuilderUtil(){}

    public static AddStudentRequest addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student name:");
          String name =   sc.nextLine();
        System.out.println("Please enter student surname:");
          String surname =   sc.nextLine();
        System.out.println("Please enter student birthday(dd/MM/yyyy):");
          String birthday =   sc.nextLine();


           AddStudentRequest addStudentRequest = new AddStudentRequest();
           addStudentRequest.setName(name);
           addStudentRequest.setSurname(surname);
           addStudentRequest.setBirthday(birthday);
           return addStudentRequest;

    }
}
