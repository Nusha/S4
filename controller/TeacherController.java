package Sem_02.controller;

import Sem_02.data.Teacher;

public class TeacherController implements UserController<Teacher, Integer> {

    public final TeacherController teacherController;

    public TeacherController(TeacherController teacherController) {
        this.teacherController = teacherController;
    }

    @Override
    public Teacher save(Teacher entry) {
        return teacherController.save(entry);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherController.findById(id);
    }

    @Override
    public Teacher findByName(String name) {
        return teacherController.findByName(name);
    }
}
