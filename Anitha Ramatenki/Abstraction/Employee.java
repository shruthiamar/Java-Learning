/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;
/**
 *
 * @author anitha.ramatenki
 */
public class Employee extends Person{
    
 private int EmpId;

public Employee(String EmployeeName, String Gen, int EmployeeID) {

super(EmployeeName, Gen);

this.EmpId = EmployeeID;

}

public void Office() {

if (EmpId == 0) {

System.out.println("Employee Logged Out");

} else {

System.out.println("Employee Logged In");

}

}

public static void main(String args[]) {

Person employee = new Employee("Anitha", "Female", 51985950);

employee.Office();

employee.changeName("Anitha Ramatenki");

System.out.println(employee.toString());

}

public void work() {

}   
}
