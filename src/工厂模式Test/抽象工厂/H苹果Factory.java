package 工厂模式Test.抽象工厂;

import 工厂模式Test.例.fruit;

public class H苹果Factory implements HIFruitFactory{
   @Override
   public fruit getFruit() {
      return new H苹果();
   }
}
