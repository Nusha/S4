package Sem_02.controller;

import Sem_02.data.User;

public interface UserController<E extends User, I> extends Controller<E, I> {
    E findByName(String name);
}
