import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
                Student student1 = new Student("Azamat", "Oralkhanov",
                        17, true);
                student1.addGrade(70);
                student1.addGrade(80);
                student1.addGrade(90);
                student1.addGrade(95);
                student1.GPA();
                Student student2 =  new Student("Erasyl", "Maniken",
                        18, true);
                student2.addGrade(70);
                student2.addGrade(80);
                student2.addGrade(90);
                student2.addGrade(95);
                student2.GPA();
                Teacher teacher1=new Teacher("Adil","Rakhmanov",
                        32,true,
                        "OOP",10,450000);
                Teacher teacher2=new Teacher("Roma","Darmanov",
                        38,true,
                        "ITP",19,840000);
                teacher1.giveArise(10);
                School school1=new School();
                school1.addMember(student1);
                school1.addMember(student2);
                school1.addMember(teacher2);
                school1.addMember(teacher1);
                System.out.println(school1);
        }
}
