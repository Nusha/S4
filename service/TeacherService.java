package Sem_02.service;

import Sem_02.data.Teacher;
import Sem_02.repository.TeacherRepository;

public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher saveTeacher(Teacher name) {
        return teacherRepository.save(name);
    }

    public Teacher findTeacherByID(int id) {
        return teacherRepository.findById(id);
    }

    public Teacher findTeacherByFio(String fio) {
        return teacherRepository.findByFio(fio);
    }
}
