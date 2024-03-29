package org.example.StudentTeacher.Util.Dto.response;

import javax.security.auth.Subject;
import java.util.Objects;

public class GetTeachersResponce {
    private Long teacherId;
    private String name;
    private String surname;
    private Integer practice;

    private Subject subject;

    @Override
    public String toString() {
        return "GetTeachersResponce{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", practise=" + practice +
                ", subject=" + subject +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTeachersResponce that = (GetTeachersResponce) o;
        return Objects.equals(teacherId, that.teacherId) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(practice, that.practice) && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, name, surname, practice, subject);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getPractise() {
        return practice;
    }

    public void setPractise(Integer practise) {
        this.practice = practise;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
