package designMode.工厂设计模式.抽象工厂模式;

public class ConcreteFactoryA extends AbstractFactoryA{
   @Override
   public ConcreteProductA go() {
      return new ConcreteProductA();
   }
}
