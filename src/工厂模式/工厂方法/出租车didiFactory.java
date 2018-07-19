package 工厂模式.工厂方法;

import 工厂模式.例.Ididi;
import 工厂模式.例.出租车;

public class 出租车didiFactory implements IdidiFactory {
   @Override
   public Ididi getDidi() {
      return new 出租车();
   }
}
