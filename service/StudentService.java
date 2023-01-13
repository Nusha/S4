package Sem_02.service;

import Sem_02.data.Student;
import Sem_02.repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student name) {
        return studentRepository.save(name);
    }

    public Student findById(int id) {
        return studentRepository.findById(id);
    }
}
