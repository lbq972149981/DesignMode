package designMode.装饰者模式;

public class Person implements Human{
   @Override
   public void wearClothes() {
      System.out.println("穿什么");
   }

   @Override
   public void walkToWhere() {
      System.out.println("去哪里");
   }
}
