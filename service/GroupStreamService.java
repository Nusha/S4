package Sem_02.service;

import java.util.List;

public interface GroupStreamService<E, I> {

    void sortStream(List groupStream);


    E saveStream(E entity);

    E findStreamByID(I entity);
}
