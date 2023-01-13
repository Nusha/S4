package Sem_02.service;

import Sem_02.data.GroupStream;
import Sem_02.data.comparator.GroupStreamComparator;
import Sem_02.repository.Repository;

import java.util.Collections;
import java.util.List;

public class GroupStreamServiceImpl implements GroupStreamService<GroupStream, Integer> {
    private final Repository<GroupStream, Integer> gsRepository;

    public GroupStreamServiceImpl(Repository<GroupStream, Integer> gsRepository) {
        this.gsRepository = gsRepository;
    }

    @Override
    public void sortStream(List groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());

    }

    @Override
    public GroupStream saveStream(GroupStream entity) {
        return gsRepository.save(entity);
    }

    @Override
    public GroupStream findStreamByID(Integer id) {
        return gsRepository.findById(id);
    }


}



