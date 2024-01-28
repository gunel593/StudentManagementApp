package org.example.Dto.request;

import javax.security.auth.Subject;
import java.util.Objects;

public class AddTeacherRequest {
    private String name;
    private String surname;
    private Integer practise;

    private Subject subject;

    @Override
    public String toString() {
        return "AddTeacherRequest{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", practise=" + practise +
                ", subject=" + subject +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddTeacherRequest that = (AddTeacherRequest) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(practise, that.practise) && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, practise, subject);
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
        return practise;
    }

    public void setPractise(Integer practise) {
        this.practise = practise;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}