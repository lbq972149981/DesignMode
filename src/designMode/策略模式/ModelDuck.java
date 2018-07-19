package designMode.策略模式;

public class ModelDuck extends Duck{
   public ModelDuck(){
      quackBehavior = new Quack();
      flyBehavior = new FlyNoWay();
   }
   /**
    * 鸭子的外貌
    */
   @Override
   public void display() {
      System.out.println("一只模型鸭");
   }
}
