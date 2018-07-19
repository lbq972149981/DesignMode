package 工厂模式Test.工厂方法;

import 工厂模式Test.例.H苹果;
import 工厂模式Test.例.fruit;

public class 苹果Factory implements IfruitFactory{
   @Override
   public fruit getFruit() {
      return new H苹果();
   }
}
