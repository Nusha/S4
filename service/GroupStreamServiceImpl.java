package Sem_02.service;

import Sem_02.data.comparator.GroupStreamComparator;

import java.util.Collections;
import java.util.List;

public class GroupStreamServiceImpl implements GroupStreamService{

    @Override
    public void sortStream(List groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());

    }
}
