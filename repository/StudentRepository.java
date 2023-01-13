package Sem_02.repository;

import Sem_02.data.Student;

public class StudentRepository implements UserRepository<Student, Integer> {

    @Override
    public Student save(Student entry) {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }
}
