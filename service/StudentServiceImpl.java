package Sem_02.service;

import Sem_02.data.Student;
import Sem_02.data.User;
import Sem_02.data.comparator.UserComparator;
import Sem_02.util.ReaderFromTxt;
import Sem_02.util.WriterToTxt;



public class StudentServiceImpl extends UserComparator implements DataService {

    @Override
    public void create(User user) {
        WriterToTxt.writeToTxt(user);
    }

    @Override
    public User read(User user) {
         return ReaderFromTxt.readFromTxt(user);

    }
    @Override
    public int compare(Student student1, Student student2) {
         UserComparator comparator = new UserComparator();
         return comparator.compare(student1,student2);
    }

}
