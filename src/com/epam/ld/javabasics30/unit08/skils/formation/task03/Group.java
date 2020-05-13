package com.epam.ld.javabasics30.unit08.skils.formation.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Group {
    private final String groupName;
    List<Student> students =new ArrayList<>();

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }

    public Group addStudent(Student student) {
        students.add(student);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return groupName.equals(group.groupName);
    }

    @Override
    public int hashCode() {
        return groupName == null ? 0 : groupName.hashCode();
    }
}
