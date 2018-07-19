package 工厂模式Test.工厂方法;

import 工厂模式Test.例.fruit;

public class Test {
   public static void main(String[] args) {
      IfruitFactory factory = new 苹果Factory();
      fruit ff = factory.getFruit();
      ff.卖水果();
   }
}
