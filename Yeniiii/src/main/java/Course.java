public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int snote;
    Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }

}
