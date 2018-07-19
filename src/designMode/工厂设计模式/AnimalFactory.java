package designMode.工厂设计模式;

import org.junit.Test;

public class AnimalFactory {
   public static Animal getAnimal(String name){
      Animal animal = null;
     switch (name){
        case "Dog":
           animal = new Dog();
           break;
        case "Cat":
           animal = new Cat();
           break;
     }
     return animal;
   }
}
