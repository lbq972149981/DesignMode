package designMode.工厂设计模式.简单工厂模式;

public class ProductA implements IProduct{
   @Override
   public void sell() {
      System.out.println("出售薯条");
   }
}
