package Sem_02.controller;

import Sem_02.data.Student;

public class StudentController implements UserController<Student, Integer> {

    public final StudentController studentController;

    public StudentController(StudentController studentController) {
        this.studentController = studentController;
    }

    @Override
    public Student save(Student entry) {
        return studentController.save(entry);
    }

    @Override
    public Student findById(Integer id) {
        return studentController.findById(id);
    }

    @Override
    public Student findByName(String name) {
        return studentController.findByName(name);
    }
}
