package Sem_02.data;

public class Student extends User implements Comparable<Student> {

    private int groupNumber;

    public Student(String name, int birthyear, String passnumber, int groupNumber) {
        super(name, birthyear, passnumber);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public int compareTo(Student o) {

        return Integer.compare(this.birthyear, o.birthyear);
    }
}
