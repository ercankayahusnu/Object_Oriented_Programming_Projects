package StudentInformationSystemProject;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        isPass = false;
    }

    public void addBullExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;

        }

        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;

        }
        if ((note3 >= 0 && note3 <= 100)) {
            this.course3.note = note3;
        }

    }

    public void calcAvarage() {
        this.avarage = (this.course1.note + this.course2.note + this.course3.note) / 3.0;
        if (avarage >= 55) {
            System.out.println(this.name + " Sınıfı Geçtin.Tebrikler");

        } else {
            System.out.println(this.name + " Sınıf Tekrarı ");
        }

    }

    public void isPass() {
        calcAvarage();
        printNote();
    }

    public void printNote() {
        System.out.println(this.course1.name + " Notu \t:" + this.course1.note);
        System.out.println(this.course2.name + " Notu \t:" + this.course2.note);
        System.out.println(this.course3.name + " Notu \t:" + this.course3.note);
        System.out.println("Ortalamanız: " + avarage);
        System.out.println("--------------------------------------------");
    }

}
