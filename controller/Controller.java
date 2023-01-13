package Sem_02.controller;

public interface Controller <E, I>{
    E save(E entry);
    E findById(I id);
    E findByFio(E fio);
}
