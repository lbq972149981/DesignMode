package designMode.策略模式;

public class MiniDuckSimulator {
   public static void main(String[] args) {
      Duck mallard = new MallardDuck();
      mallard.performFly();
      mallard.performQuack();
      System.out.println("------------------");
      Duck model = new ModelDuck();
      model.performFly();
      //让不会飞的模型鸭子使用助推器
      model.setFlyBehavior(new FlyRocketPowered());
      model.performFly();
   }
}
