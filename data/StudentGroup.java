package Sem_02.data;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private Teacher teacher;
    private List<Student> studentlist;

    private int groupNumber;

    /* Так как переменные мы пишем в кэмелКейс, то правильно будет groupNum, а еще лучше groupNumber.
    Исправил.
     */

    public StudentGroup(Teacher teacher, List<Student> studentlist, int groupNumber) {
        this.teacher = teacher;
        this.studentlist = studentlist;
        this.groupNumber = groupNumber;
    }

    public StudentGroup(Teacher teacher, List<Student> studentlist) {
        this.teacher = teacher;
        this.studentlist = studentlist;
    }

    public StudentGroup() {
//        this.teacher = teacher;
//        this.studentlist = studentlist;
        this.groupNumber = groupNumber;

    }

    public StudentGroup(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(List<Student> studentlist) {
        this.studentlist = studentlist;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
