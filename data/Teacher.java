package Sem_02.data;

public class Teacher extends User {
    private String deptname;

    public Teacher(String name, int birthyear, String passnumber, String deptname) {
        super(name, birthyear, passnumber);
        this.deptname = deptname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
