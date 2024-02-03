package org.example.StudentTeacher.Util.Dto.request;

import java.util.Objects;

public class AddStudentRequest {
    private String name;
    private String surname;
    private String birthday;

    @Override
    public String toString() {
        return "AddStudentRequest{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddStudentRequest that = (AddStudentRequest) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthday);
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}