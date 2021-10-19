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

public abstract class Person {
private String Name;

private String Gender;

public Person(String nm, String Gen) {
this.Name = nm;
this.Gender = Gen;
}

public abstract void work();
public String toString() {
return "Name=" + this.Name + "::Gender=" + this.Gender;
}

public void changeName(String newName) {
this.Name = newName;
}

public void Exam() {

}

public void Office() {
}
}
