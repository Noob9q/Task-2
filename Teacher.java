public class Teacher {
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    private String subject;
    private int yearsOfExperience;
    private double salary;
    public Teacher(String name, String surname,String subject, int age,int yearsOfExperience,double salary, boolean gender) {
        this.name = name;
        this.subject = subject;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public  void giveArise(double precantage){
        double sl=this.salary*(precantage/100);
        this.salary+=sl;
    }
    public String toString() {
        return "My name is "+name+ " "+ surname+
                "\nyears old "+age+" my years of experience:"+yearsOfExperience+
                "\nmy subject is: "+subject+
                "\nmy salary is: "+salary+" "+(gender? "male":"female");
    }
}
