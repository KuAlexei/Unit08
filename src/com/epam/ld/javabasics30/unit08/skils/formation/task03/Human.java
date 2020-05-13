package com.epam.ld.javabasics30.unit08.skils.formation.task03;

import java.util.Arrays;

public class Human {

    private String surname;
    private String name;
    private String fathersName;

    public Human(String surname, String name, String fathersName) {
        this.surname = surname;
        this.name = name;
        this.fathersName = fathersName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return surname.equals(human.surname) && name.equals(human.name) && fathersName.equals(human.fathersName);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] {surname, name, fathersName });
    }
}
