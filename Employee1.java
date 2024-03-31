import java.time.LocalDate;
import java.time.Period;

public class Employee1{
    private String name;
    private LocalDate dob;
    public Employee1(String name,LocalDate dob){
        this.name=name;
        this.dob=dob;} 

    public void display(){
        System.out.println("Name is:"+name);
    }
    public void displayAge(LocalDate currDate){
       
        Period age=Period.between(dob,currDate);
        System.out.println("student age "+age.getYears());
    }
    public static void main(String[] args) {
        LocalDate dob=LocalDate.of(2004, 05, 11);
        Empolyee1 s1=new Person("Suraj Umarani",dob);
        s1.display();
        LocalDate currDate=LocalDate.now();     
        s1.displayAge(currDate);
    }
}
