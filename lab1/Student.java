package labs_java.lab1;

public class Student {
    private String name;
    private int age;
    private boolean isArrears;

    public Student(String name, int age, boolean isArrears) {
        this.name = name;
        this.age = age;
        this.isArrears = isArrears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int amount) {
        this.age = amount;
    }

    public boolean isArrears() {
        return isArrears;
    }

    public void setArrears(boolean arrears) {
        isArrears = arrears;
    }
}
