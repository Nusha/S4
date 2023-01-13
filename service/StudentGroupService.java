package Sem_02.service;

import Sem_02.data.Student;
import Sem_02.data.StudentGroup;

public interface StudentGroupService {
    StudentGroup createGroup(int groupNumber);

    StudentGroup getGroup();

    void removeStudent(Student name);


}
