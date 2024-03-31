import java.time.LocalDate;

public class Employee_Details extends Employee1{
    String emp_id;
    double salary;
    public Employee_Details(String name,LocalDate dob,String emp_id,double salary){
      super(name,dob);
        this.emp_id=emp_id;
        this.salary=salary;
      }
      public void displayDetails(){
         System.out.println("Emp_id:"+emp_id);
         System.out.println("Salary:"+salary);
      }
      public static void main(String[] args){
    
         LocalDate dob=LocalDate.of(2004, 05, 11);
         Employee_Details e1=new Employee_Details("Suraj Umarani",dob,"ED101",25000.5);
         e1.display();
         LocalDate currDate=LocalDate.now();     
         e1.displayAge(currDate);
         e1.displayDetails();
      }
 }
 
