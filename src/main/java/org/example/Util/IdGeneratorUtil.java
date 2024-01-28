package org.example.Util;

public final class IdGeneratorUtil {
    private IdGeneratorUtil(){

    }
    private static Long studentId=0L;
    private static long teacherId = 0l;
    public static Long getNewStudentId(){

        return studentId++;
    }

    public static long getNewTeachertId(){
        return teacherId++;
    }
}

