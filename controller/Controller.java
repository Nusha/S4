package Sem_02.controller;

import Sem_02.data.Student;
import Sem_02.data.StudentGroup;
import Sem_02.service.*;

import java.util.List;


public class Controller {
    private DataService studentService;
    private StudentGroupService studentGroupService;
    private GroupStreamService groupStreamService;

    private Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public Controller(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public Controller(GroupStreamService groupStreamService) {
        this.groupStreamService = groupStreamService;
    }

    public Student createStudent(Student student) {
        studentService.create(student);
        return (Student) studentService.read(student);
    }

    public int compareStudent(Student student1, Student student2) {
        return studentService.compare(student1, student2);
    }

    public int compareStudentName(Student student1, Student student2) {
        return studentService.compareName(student1, student2);
    }

    public StudentGroup createGroup(int groupNumber) {
        return studentGroupService.createGroup(groupNumber);
    }

    public void removeStudent(Student name) {
        studentGroupService.removeStudent(name);
    }

    public void sortStream(List groupStream) {
        groupStreamService.sortStream(groupStream);
    }


}
