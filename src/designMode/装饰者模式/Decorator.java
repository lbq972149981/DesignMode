package designMode.装饰者模式;

abstract public class Decorator implements Human{
   private Human human;
   public Decorator(Human human) {
      this.human = human;
   }
   public void wearClothes() {
      human.wearClothes();
   }
   public void walkToWhere() {
      human.walkToWhere();
   }
}
