package designMode.策略模式;

public class FlyRocketPowered implements FlyBehavior{
   @Override
   public void fly() {
      System.out.println("依靠火箭助推器飞行");
   }
}
