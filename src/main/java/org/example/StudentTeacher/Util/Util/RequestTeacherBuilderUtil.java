package org.example.StudentTeacher.Util.Util;

import org.example.StudentTeacher.Util.Dto.request.AddTeacherRequest;

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
        System.out.println("Please enter pratice:");
        int practice = sc.nextInt();
        AddTeacherRequest addTeacherRequest = new AddTeacherRequest();
        addTeacherRequest.setName(name1);

        addTeacherRequest.setSurname(surname1);
        return addTeacherRequest;

    }
}
