package org.example.StudentTeacher.Util.Repository;

import org.example.StudentTeacher.Util.Entity.Teacher;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherMySqlRepositoryImpl extends TeacherRepository {
    private static final TeacherMySqlRepositoryImpl INSTANCE =new TeacherMySqlRepositoryImpl();
    private TeacherMySqlRepositoryImpl(){

    }
    public static TeacherMySqlRepositoryImpl getInstance(){
        return INSTANCE;
    }
    @Override
    public void AddTeacher(Teacher teacher){
 try{
     Connection cn = getConnection();
     String query ="insert into teachers(name,surname,practice,subject) values(?,?,?,?)";
     PreparedStatement pst=cn.prepareStatement(query);
     pst.setString(1, teacher.getName());
     pst.setString(2, teacher.getSurname());
     pst.setInt(3, teacher.getPractice());
     pst.setString(4, String.valueOf(teacher.getSubjects()));
     pst.executeUpdate();
     cn.close();

 }catch (Exception ex){
     ex.printStackTrace();
 }
    }

    @Override
    public List<Teacher> getAllTeachers(){
        try {
            Connection cn =getConnection();
            String query = "SELECT id,name,surname,practice,subject FROM teacher_table.teachers";
            Statement st = cn.createStatement();
            ResultSet resultSet=st.executeQuery(query);
            List<Teacher>teacherList= new ArrayList<>();
           while (resultSet.next()){
               long id =resultSet.getInt("id");
               int practice = resultSet.getInt("practice");
               String name = resultSet.getString("name");
               String surname = resultSet.getString("surname");
               String subject= resultSet.getString("subject");
               Teacher teacher= new Teacher();
               teacher.setTeacherId(id);
               teacher.setName(name);
               teacher.setSurname(surname);
               teacher.setPractice(practice);
               teacher.setSubs(subject);
               teacherList.add(teacher);


           }
           cn.close();
           return teacherList;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException();

        }
    }
    private  Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/teacher_table?useSSL=false";
            String username = "root";
            String password = "cehenemmeleyi01!";
            return  DriverManager.getConnection(url,username,password);
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException("error");
        }
    }

}
