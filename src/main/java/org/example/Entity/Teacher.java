package org.example.Entity;

import java.util.Objects;

public class Teacher extends Human{
    private Long teacherId;
    private Subjects subjects;
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ",subjects=" + subjects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(teacherId, teacher.teacherId) && subjects == teacher.subjects;
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId,subjects);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubs(Subjects subjects) {
        this.subjects = subjects;
    }
}
