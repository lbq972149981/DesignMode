package designMode.工厂设计模式.工厂方法模式;

public class MCDCreator implements Creator{
   @Override
   public IProduct sell() {
     return new MCDProduct();
   }
}
