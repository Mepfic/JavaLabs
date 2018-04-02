package labs_java.lab1;

public class Run {

    public static void main(String[] args) {
        Student students[] = new Student[]{
                new Student("Ivanov", 22, true),
                new Student("Petrov", 21, true),
                new Student("Sidorov", 20, false),
                new Student("Timofeev", 19, true),
                new Student("Andreev", 20, false),
                new Student("Sereev", 21, true),
                new Student("Aleksandrov", 21, false),
                new Student("Chernov", 24, true),
                new Student("Stepanov", 23, true),
                new Student("Klimov", 23, false)};
        double sumAge = 0;
        double averAge;
        int sumArrears = 0;
        for (Student student : students) {
            if (student.isArrears()==true){
                sumArrears++;
            }
            sumAge += student.getAge();
        }
        averAge = sumAge/students.length;
        System.out.println("Average age of students = " + averAge);
        System.out.println("Summary amount of students with arrears = " + sumArrears);
    }
}