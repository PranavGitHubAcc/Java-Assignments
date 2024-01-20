class Student {
    private String name;
    private String course;
    private int prn;

    public Student(String name, String course, int prn) {
        this.name = name;
        this.course = course;
        this.prn = prn;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getPrn() {
        return prn;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Course: " + this.course);
        System.out.println("Student PRN: " + this.prn);
    }
}

class Course {
    private String courseName;
    private Teacher teacher;

    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
    }

    public String getName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + this.getName());
        System.out.println("Teacher Name: " + this.getTeacher().getTeacherName());
        System.out.println("Teacher Subject: " + this.getTeacher().getSubject());
    }
}

class Teacher {
    private String subject;
    private String name;

    public Teacher(String subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    public String getTeacherName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }
}

public class School {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Math", "John Doe");
        Course course = new Course("Computer Science", teacher);
        Student student = new Student("Pranav", "Math", 153);

        student.displayStudentInfo();
        course.displayCourseInfo();
    }
}
