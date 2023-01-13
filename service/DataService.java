package Sem_02.service;

import Sem_02.data.Student;
import Sem_02.data.User;

public interface DataService {
    void create(User user);
    User read(User user); // Удалил дефолтные методы. Добавил абстрактные.

    int compare(Student student1, Student student2);
    int compareName(Student student1, Student student2);
}
