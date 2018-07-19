package 工厂模式.工厂方法;

import 工厂模式.例.Ididi;
import 工厂模式.例.快车;

public class 快车didiFactory implements IdidiFactory{
   @Override
   public Ididi getDidi() {
      return new 快车();
   }
}
