package 工厂模式Test.抽象工厂;

import 工厂模式Test.例.fruit;

public class Test {
   public static void main(String[] args) {
      SIFruitFactory fruitFactory = new S苹果Factory();
      fruit ff = fruitFactory.getFruit();
      ff.卖水果();
   }
}
