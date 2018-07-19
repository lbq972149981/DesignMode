package designMode.策略模式;

public abstract class Duck {
   FlyBehavior flyBehavior;//飞行行为
   QuackBehavior quackBehavior;//叫的行为
   /**
    * 鸭子的外貌
    */
   public abstract void display();
   public void performFly(){
      flyBehavior.fly();
   }
   public void performQuack(){
      quackBehavior.quack();
   }
   public void swim(){
      System.out.println("All ducks float, even decoys");
   }
   public void setFlyBehavior(FlyBehavior flyBehavior) {
      this.flyBehavior = flyBehavior;
   }
   public void setQuackBehavior(QuackBehavior quackBehavior) {
      this.quackBehavior = quackBehavior;
   }
}

