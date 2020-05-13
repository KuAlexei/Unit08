package com.epam.ld.javabasics30.unit08.skils.formation.task03;

import java.util.*;

public class Student extends Human {

    private Map<Discipline, Mark> recordBook = new HashMap<>();
    public Student(String surname, String name, String fathersName) {
        super(surname, name, fathersName);
    }

    public Student setDisciplineMark(Discipline discipline, Mark mark) {
        if ((discipline != null) && (mark != null)) {
            this.recordBook.put(discipline, mark);
        }
        return this;
    }

    public Map<Discipline, Mark> getRecordBook() {
        return Collections.unmodifiableMap(recordBook);
    }

}
