/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework.zoo;

/**
 *
 * @author DERRICK
 */
public class Monkey extends Animal {

    public Monkey(String name, int age) {
        super(name, age);
    }
    
    //Override
    @Override
    public void makeSound() {
        System.out.println("Chatter");
    }
    
    //Override
    @Override
    public void eat() {
        System.out.println("Eating bananas");
    }
}
  
