public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher(String name, String surname, int age, boolean gender,
                   String subject, int yearsOfExperience, int salary){
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }
    public void giveArise(int pros) {
        double arise = this.salary * (pros / 100.0); // Деление как `double`
        this.salary += arise;
    }
    public String toString() {
        return super.toString()+" Years of experience "+yearsOfExperience+
                "\nmy subject is: "+subject+
                "\nmy salary is: "+salary+" ";
    }
}
