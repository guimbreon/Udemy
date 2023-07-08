package ObjectClass;

import java.util.PrimitiveIterator;

public class Main extends Object{
    public static void main(String[] args) {
        Student max = new Student("Max",21);
        System.out.println(max);

        PrimarySchoolStudent jimy = new PrimarySchoolStudent("jimy",8,"joel");
        System.out.println(jimy);
    }
}
class Student{
    private String name;
    private int age;
    Student(String name, int age){
        this.age = age;
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}


class PrimarySchoolStudent extends Student{
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s Kid, " + super.toString();
    }
}