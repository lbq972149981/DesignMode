package designMode.策略模式;

public class FlyWithWings implements FlyBehavior{
   @Override
   public void fly() {
      System.out.println("可以飞");
   }
}
