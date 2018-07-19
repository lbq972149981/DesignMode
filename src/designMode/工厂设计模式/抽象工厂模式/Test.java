package designMode.工厂设计模式.抽象工厂模式;

public class Test {
   public static void main(String[] args) {
      new ConcreteFactoryA().go().banana();
      new ConcreteFactoryB().go().apple();
   }
}
