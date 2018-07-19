package designMode.策略模式;

public class FlyNoWay implements FlyBehavior{
   @Override
   public void fly() {
      System.out.println("不能飞");
   }
}
