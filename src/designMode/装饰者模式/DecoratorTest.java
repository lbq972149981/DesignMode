package designMode.装饰者模式;

public class DecoratorTest {
   public static void main(String[] args) {
      Human person = new Person();
      Decorator decorator = new Decorator_3(new Decorator_2(
            new Decorator_1(person)));
      decorator.wearClothes();
      decorator.walkToWhere();
   }
}
