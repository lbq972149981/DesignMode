package designMode.装饰者模式;

public class Decorator_2 extends Decorator{
   public Decorator_2(Human human) {
      super(human);
   }
   public void goClothespress() {
      System.out.println("去衣柜找找看。。");
   }
   public void findPlaceOnMap() {
      System.out.println("在Map上找找。。");
   }
   @Override
   public void wearClothes() {
      // TODO Auto-generated method stub
      super.wearClothes();
      goClothespress();
   }
   @Override
   public void walkToWhere() {
      // TODO Auto-generated method stub
      super.walkToWhere();
      findPlaceOnMap();
   }
}
