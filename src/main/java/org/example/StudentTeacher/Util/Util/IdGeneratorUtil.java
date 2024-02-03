package org.example.StudentTeacher.Util.Util;

public final class IdGeneratorUtil {
    private IdGeneratorUtil(){

    }
    private static Long studentId=0L;
    private static long teacherId = 0L;
    public static Long getNewStudentId(){

        return studentId++;
    }

    public static long getNewTeachertId(){
        return teacherId++;
    }
}

