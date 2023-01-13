package Sem_02.service;

import Sem_02.data.Student;
import Sem_02.data.StudentGroup;

public interface StudentGroupService {
    /** Работа над ошибками 2 урок.
     * Создать интерфейс с абстрактным методом StudentGroup createGroup(int groupNumber).
     * Создал абстрактный метод StudentGroup createGroup(int groupNumber).
     */
    StudentGroup createGroup(int groupNumber);

    StudentGroup getGroup();

    void removeStudent(Student name);



}
