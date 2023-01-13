package Sem_02.data;

import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup> {

    private List<StudentGroup> studentGroups;

    public GroupStream(List studentGroups) {
        this.studentGroups = studentGroups;
    }

    public List getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List studentGroups) {
        this.studentGroups = studentGroups;
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }

}
