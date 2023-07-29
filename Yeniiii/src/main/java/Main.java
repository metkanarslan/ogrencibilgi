public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell","FZK","0230");
        Teacher t3 = new Teacher("Bedük","BIO","232");
        Course tarih = new Course("Tarih","101","TRH");
        Course fizik = new Course ("Fizik","203","FZK");
        Course biyo = new Course("Biyoloji","233","BIO");
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyo.addTeacher(t3);
        Student s1 = new Student("İnek Şaban","531","4",tarih,fizik,biyo);
        s1.addBulkExamNote(65,90,80);
        s1.addSnote(70,70,70);
        s1.isPass();
    }
}
