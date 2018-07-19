package designMode.工厂设计模式.简单工厂模式;

public class Test {
   public static void main(String[] args) {
      Creator creator = new Creator();
      creator.go(1).sell();
      creator.go(2).sell();
   }
}
