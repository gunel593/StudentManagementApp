package org.example.Repository;

import org.example.Entity.Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeacherRepository {
    private static final Map<Long, Teacher> teacher1 = new HashMap<>();
    public void AddTeacher(Teacher teacher){
        teacher1.put(teacher.getTeacherId(), teacher);

    }
    public Teacher getTeacherByTd(Long id){
        Teacher teacher = teacher1.get(id);
        return teacher;
    }
    public List<Teacher>getAllTeachers(){
        return new ArrayList<>(teacher1.values());
    }
}
