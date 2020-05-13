package com.epam.ld.javabasics30.unit08.skils.formation;

import com.epam.ld.javabasics30.unit08.skils.formation.task03.Discipline;
import com.epam.ld.javabasics30.unit08.skils.formation.task03.Group;
import com.epam.ld.javabasics30.unit08.skils.formation.task03.Mark;
import com.epam.ld.javabasics30.unit08.skils.formation.task03.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task03 {

    public double getGroupAverageMark(Group group) {
        List<Student> studentList = group.getStudents();
        double sumMarks = 0;
        for (Student student : studentList) {
            sumMarks += getStudentAverageMark(student);
        }
        return sumMarks / studentList.size();
    }

    public double getStudentAverageMark(Student student) {
        Map<Discipline, Mark> studentRecordBook = student.getRecordBook();
        int sumMarks = 0;
        for (Mark mark : studentRecordBook.values()) {
            sumMarks += mark.getValue();
        }
        return ((double)sumMarks) / studentRecordBook.size();
    }

    public Map<Student, Double> getStudentsAverageMark(Group group) {
        Map<Student, Double> result = new HashMap<>();
        for (Student student : group.getStudents()) {
            result.put(student, getStudentAverageMark(student));
        }
        return result;
    }

    public int getExcellentStudentsCount(Group group) {
        int excellentCount = 0;
        studentLoop:
        for (Student student :  group.getStudents()) {
            for (Mark mark : student.getRecordBook().values()) {
                if (mark != Mark.EXCELLENT) {
                    continue studentLoop;
                }
            }
            excellentCount++;
        }
        return excellentCount;
    }

    public int getHave2MarkStudentsCount(Group group) {
        int have2Count = 0;
        for (Student student :  group.getStudents()) {
            for (Mark mark : student.getRecordBook().values()) {
                if (mark == Mark.UNSATISFACTORILY) {
                    have2Count++;
                    break;
                }
            }
        }
        return have2Count;
    }

}
