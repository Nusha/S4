package Sem_02.repository;

import Sem_02.data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    E findByFio(String fio);
}
