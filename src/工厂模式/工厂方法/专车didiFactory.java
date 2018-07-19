package 工厂模式.工厂方法;

import 工厂模式.例.Ididi;
import 工厂模式.例.专车;

public class 专车didiFactory implements IdidiFactory{
   @Override
   public Ididi getDidi() {
      return new 专车();
   }
}
