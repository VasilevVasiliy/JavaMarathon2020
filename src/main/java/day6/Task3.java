package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher Klavdiya = new Teacher("Клавдия Львовна", "Химия");
        Student Ryabinin = new Student("Александр");

        Klavdiya.evaluate(Ryabinin);
    }
}

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student1) {
        int grades = (int) (2 + Math.random() * 5);
        String grds;
        switch (grades) {
            case 2:
                grds = "неудовлетворительно";
            case 3:
                grds = "удовлетворительно";
            case 4:
                grds = "хорошо";
            case 5:
                grds = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student1.getName() +
                " по предмету " + subject + " на оценку " + grades);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}