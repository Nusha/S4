package Sem_02.data;

public abstract class User {

    private String name;
    protected int birthyear;
    private String passnumber;

    public User(String name, int birthyear, String passnumber) {
        this.name = name;
        this.birthyear = birthyear;
        this.passnumber = passnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public String getPassnumber() {
        return passnumber;
    }

    public void setPassnumber(String passnumber) {
        this.passnumber = passnumber;
    }
}
