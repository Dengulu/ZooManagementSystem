/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coursework.zoo;

/**
 *
 * @author DERRICK
 */



public class Zoo {
    public static void main(String[] args) {
        // Create instances of different animals
        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Dumbo", 10);
        Animal monkey = new Monkey("George", 3);

        // Demonstrate polymorphism with overridden methods
        lion.makeSound(); 
        lion.eat();       

        elephant.makeSound(); 
        elephant.eat();       

        monkey.makeSound(); 
        monkey.eat();       

    }
}


 