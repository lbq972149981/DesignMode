package 工厂模式Test.抽象工厂;

import 工厂模式Test.例.fruit;

public class H香蕉Factory implements HIFruitFactory{
   @Override
   public fruit getFruit() {
      return new H香蕉();
   }
}
