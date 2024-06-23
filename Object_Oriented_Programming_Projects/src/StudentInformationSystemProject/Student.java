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

    public void addBullExamNote(int note1, int note2, int note3, int veriableNote1, int veriableNote2, int veriableNote3) {
        if ((note1 >= 0 && note1 <= 100)) {
            this.course1.note = note1;
        }

        if ((veriableNote1 >= 0 && veriableNote1 <= 100)) {
            this.course1.verbalNote = veriableNote1;
        }

        if ((note2 >= 0 && note2 <= 100)) {
            this.course2.note = note2;

        }

        if ((veriableNote2 >= 0 && veriableNote2 <= 100)) {
            this.course2.verbalNote = veriableNote2;
        }

        if ((note3 >= 0 && note3 <= 100)) {
            this.course3.note = note3;

        }

        if ((veriableNote3 >= 0 && veriableNote3 <= 100)) {
            this.course3.verbalNote = veriableNote3;
        }

    }

    public void calcAvarage() {
        double course1Average = (this.course1.note * 0.80) + (this.course1.verbalNote * 0.20);
        double course2Average = (this.course2.note * 0.70) + (this.course2.verbalNote * 0.30);
        double course3Average = (this.course3.note * 0.60) + (this.course3.verbalNote * 0.40);

        this.avarage = (course1Average + course2Average + course3Average) / 3.0;

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
        System.out.println(this.course1.name + " Notu \t:" + this.course1.note + "\tSözlü Notu \t:" + this.course1.verbalNote);
        System.out.println(this.course2.name + " Notu \t:" + this.course2.note + "\tSözlü Notu \t:" + this.course2.verbalNote);
        System.out.println(this.course3.name + " Notu \t:" + this.course3.note + "\tSözlü Notu \t:" + this.course3.verbalNote);
        System.out.println("Ortalamanız: " + avarage);
        System.out.println("--------------------------------------------");

    }

}
