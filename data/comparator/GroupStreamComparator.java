package Sem_02.data.comparator;

import Sem_02.data.GroupStream;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {


    @Override
    public int compare(GroupStream o1, GroupStream o2) {
        int groupQuantity1 = o1.getStudentGroups().size();
        int groupQuantity2 = o2.getStudentGroups().size();
        return Integer.compare(groupQuantity1, groupQuantity2);
    }
}
