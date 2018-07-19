package designMode.工厂设计模式.抽象工厂模式;

public class ConcreteFactoryB extends AbstractFactoryB{
   @Override
   public ConcreteProductB go() {
      return new ConcreteProductB();
   }
}
