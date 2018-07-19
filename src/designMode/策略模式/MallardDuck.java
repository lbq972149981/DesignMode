package designMode.策略模式;

public class MallardDuck extends Duck{
   public MallardDuck(){
      quackBehavior = new Quack();
      flyBehavior = new FlyWithWings();
   }
   /**
    * 鸭子的外貌
    */
   @Override
   public void display() {
      System.out.println("一只野鸭子");
   }
}
