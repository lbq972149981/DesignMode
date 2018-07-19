package 工厂模式Test.抽象工厂;

import 工厂模式Test.例.fruit;

public class S香蕉Factory implements SIFruitFactory{
   @Override
   public fruit getFruit() {
      return new S香蕉();
   }
}
