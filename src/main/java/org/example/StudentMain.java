 package org.example;

import org.example.StudentTeacher.Util.Controller.StudentController;
import org.example.StudentTeacher.Util.Controller.TeacherController;
import org.example.StudentTeacher.Util.Dto.request.AddStudentRequest;
import org.example.StudentTeacher.Util.Dto.request.AddTeacherRequest;
import org.example.StudentTeacher.Util.Dto.response.GetStudentsResponce;
import org.example.StudentTeacher.Util.Dto.response.GetTeachersResponce;
import org.example.StudentTeacher.Util.Util.RequestBuilderUtil;
import org.example.StudentTeacher.Util.Util.RequestTeacherBuilderUtil;

import java.util.List;
import java.util.Scanner;


 class StudentMain {
    private static final StudentController studentController = new StudentController();
    private static final TeacherController teacherController = new TeacherController();

    public static void main(String[] args) {
        while (true) {
            menu();
        }

    }

    private static void menu() {
        System.out.println("""
                -----------------------------
                Choose your process
                  1.Add Student
                  2.get Student
                  3.Add teacher
                  4.get teacher
                 """);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                addStudent();

                break;
            case 2:
                getAllStudents();
                break;
            case 3:
                addTeacher();
                break;
            case 4:
                getTeacher();
            default:
            defaults();

                break;
        }
    }

    private static void addStudent() {
        AddStudentRequest addStudentRequest = RequestBuilderUtil.addStudent();
        studentController.addStudent(addStudentRequest);

    }

    private static void addTeacher() {
        AddTeacherRequest addTeacherRequest = RequestTeacherBuilderUtil.addTeacher();
        teacherController.addTeacher(addTeacherRequest);
    }

    private static void getAllStudents() {
        List<GetStudentsResponce> students = studentController.getAllStudents();
        for (GetStudentsResponce student : students) {
            System.out.println(students.toString());

        }
    }
        private static void getTeacher(){
            List<GetTeachersResponce> teachers = teacherController.getAllTeachers();
            for (GetTeachersResponce teacher : teachers) {
                System.out.println(teachers.toString());

            }

        }
        private static void defaults(){
            System.out.println("Your choice is not true.Please choose again");
            menu();
        }
    }
