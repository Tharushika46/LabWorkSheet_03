package Q_05;

public class Main {
    public static void main(String[] args) {

        Course oop = new Course();
        oop.setCourseName("Object oriented programming");
        oop.setCourseCode("CTEC22043");

        Lecturer Kumar  = new Lecturer();
        Kumar.setLecturerName("Kumar");
        Kumar.setCourseTeaching("Object oriented programming");

        Student Dhananjaya = new Student();
        Dhananjaya.setStudentName("Dhananjaya");
        Dhananjaya.setDegreeName("BICT");
        Dhananjaya.setCourseFollowing("Object oriented programming");

        System.out.println("Student Details:");
        System.out.println("Student Name: " + Dhananjaya.getStudentName());
        System.out.println("Degree Name: " + Dhananjaya.getDegreeName());
        System.out.println("Course Code and Name: " + oop.getCourseCode() +" - "+ oop.getCourseName() );
        System.out.println("Lecturer Name: " + Kumar.getLecturerName());


    }
}
