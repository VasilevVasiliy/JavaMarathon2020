package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student s1 = new Student("Петя", "Дрочилы");
        Teacher t1 = new Teacher("Мариванна", "Химия");

        System.out.println(s1.getGroupName());
        System.out.println(t1.getSubjectName());

        s1.printInfo();
        t1.printInfo();


    }
}

class Human {
    private String name;

    Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Это человек с именеем " + name);
    }
}

class Student extends Human {
    private String groupName;

    Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }
}

class Teacher extends Human {
    private String subjectName;

    Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }


    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }
}
