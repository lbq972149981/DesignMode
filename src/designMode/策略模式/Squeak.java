package designMode.策略模式;

public class Squeak implements QuackBehavior{
   @Override
   public void quack() {
      System.out.println("呱呱叫");
   }
}
