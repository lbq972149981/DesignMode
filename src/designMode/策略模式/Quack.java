package designMode.策略模式;

public class Quack implements QuackBehavior{
   @Override
   public void quack() {
      System.out.println("嘎嘎叫");
   }
}
