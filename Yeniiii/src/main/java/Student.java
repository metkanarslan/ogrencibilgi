public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course a1;
    Course a2;
    Course a3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addSnote(int snote1, int snote2, int snote3){
        if(snote1>=0&&snote1<=100) {
            c1.snote = snote1;
        }
        if(snote2>=0&&snote2<=100) {
            this.c2.snote = snote2;
        }
        if(snote3>=0&&snote3<=100) {
            this.c3.snote = snote3;
        }
    }

    void addBulkExamNote(int note1,int note2,int note3){
        if(note1>=0&&note1<=100) {
            c1.note = note1;
        }
        if(note2>=0&&note2<=100) {
            c2.note = note2;
        }
        if(note3>=0&&note3<=100) {
            c3.note = note3;
        }

    }
    void printNote(){
        System.out.println(c1.name+" Notu:"+c1.note);
        System.out.println(c2.name+" Notu:"+c2.note);
        System.out.println(c3.name+" Notu:"+c3.note);
        System.out.println("Ortalamanız : "+this.avarage);
    }
    void isPass(){
        this.avarage = ((c1.note*0.8+c1.snote*0.2)+(c2.note*0.8+c2.snote*0.2)+(c3.note*0.8+c3.snote*0.2))/3.0;
        if(this.avarage>55) {
            System.out.println("Sınıfı Geçtiniz");
            this.isPass = true;
        }else {
            System.out.println("Kaldınız AMK");
            this.isPass = false;
        }
        printNote();

    }

}
