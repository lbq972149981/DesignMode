package designMode.工厂设计模式;

public class test {
   public static void main(String[] args) {
      Animal animal = AnimalFactory.getAnimal("Dog");
      animal.say();
   }
}
