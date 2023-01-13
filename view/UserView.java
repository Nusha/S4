package Sem_02.view;

import Sem_02.data.User;

import java.util.List;

public abstract class UserView {
    public void showTheBest(List<User> userList){
    User user = findTheBest(userList);
    }
    protected abstract User findTheBest(List<User> userList);

}
