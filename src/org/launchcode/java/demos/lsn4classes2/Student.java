package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    public String getGradeLevel() {
        if (this.numberOfCredits >= 90) {
            return "Senior";
        } else if (this.numberOfCredits >= 60) {
            return "Junior";
        } else if (this.numberOfCredits >= 30) {
            return "Sophomore";
        } else {
            return "Freshman";
        }
    }

    public void addGrade(int courseCredits, double grade) {
        int newCreditTotal = this.numberOfCredits + courseCredits;
        this.gpa = ((this.numberOfCredits * this.gpa) + (courseCredits * grade)) / newCreditTotal;
        this.numberOfCredits = newCreditTotal;

    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally.gpa);
        sally.addGrade(12, 3.5);
        System.out.println(sally.gpa);
        sally.addGrade(25, 3.8);
        System.out.println(sally.gpa);
    }
}
