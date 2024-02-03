package org.example.StudentTeacher.Util.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class DateUtil {
    private DateUtil(){}
    public static LocalDate toLocalDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.parse(date,formatter);
        return localDate;
    }
    public static String toString(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);

    }
}
