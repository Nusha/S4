package Sem_02.controller;

import Sem_02.data.Student;
import Sem_02.data.StudentGroup;
import Sem_02.service.StudentGroupServiceImpl;

public class GroupController implements Controller<StudentGroup, Integer> {

    public final StudentGroupServiceImpl studentGroupService;

    public GroupController(StudentGroupServiceImpl studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    @Override
    public StudentGroup save(StudentGroup entry) {
        return studentGroupService.saveGroup(entry);
    }

    @Override
    public StudentGroup findById(Integer id) {
        return studentGroupService.findGroup(id);
    }

    public StudentGroup createGroup(Integer groupNumber) {
        return studentGroupService.createGroup(groupNumber);
    }

    public void removeStudent(Student name) {
        studentGroupService.removeStudent(name);
    }
}
