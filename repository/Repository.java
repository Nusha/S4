package Sem_02.repository;

public interface Repository<E, I> {
    E save(E entry);

    E findById(I id);
}
