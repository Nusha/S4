package Sem_02.data;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<StudentGroup> {

    private final GroupStream groupStream;
    private final List<StudentGroup> groups;

    private int cursor;

    public GroupStreamIterator(GroupStream groupStream) {
        this.groupStream = groupStream;
        this.groups = groupStream.getStudentGroups();
    }

    @Override
    public boolean hasNext() {
        return cursor < groups.size();
    }

    @Override
    public StudentGroup next() {
        return groups.get(cursor++);
    }

    @Override
    public void remove() {
        groups.remove(cursor);
    }
}
