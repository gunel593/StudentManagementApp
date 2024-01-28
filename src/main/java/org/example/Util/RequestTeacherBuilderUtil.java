package org.example.Util;

import org.example.Dto.request.AddStudentRequest;
import org.example.Dto.request.AddTeacherRequest;

import javax.security.auth.Subject;
import java.util.Scanner;

public class RequestTeacherBuilderUtil {
    private void RequestTeacherBuilderUtilBuilderUtil(){}
    public static AddTeacherRequest addTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter teacher name:");
        String name1 = sc.nextLine();
        System.out.println("Please enter teacher surname:");
        String surname1 = sc.nextLine();
        System.out.println("Please enter subject:");
        String sub = sc.nextLine();
        AddTeacherRequest addTeacherRequest = new AddTeacherRequest();
        addTeacherRequest.setName(name1);

        addTeacherRequest.setSurname(surname1);
        return addTeacherRequest;

    }
}
