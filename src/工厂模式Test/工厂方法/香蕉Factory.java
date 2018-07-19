package 工厂模式Test.工厂方法;

import 工厂模式Test.例.H香蕉;
import 工厂模式Test.例.fruit;

public class 香蕉Factory implements IfruitFactory{
   @Override
   public fruit getFruit() {
      return new H香蕉();
   }
}
