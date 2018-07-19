package designMode.观察者模式;

import java.util.Observable;
import java.util.Observer;

public class HousePriceObserver implements Observer {
   private String name;
   public HousePriceObserver(String name) {
      super();
      this.name = name;
   }
   @Override
   public void update(Observable o, Object arg) {// 只要改变了 observable 对象就调用此方法
      if (arg instanceof Float) {
         System.out.println(this.name + "观察的价格更改为:" + ((Float) arg).floatValue());
      }
   }
}
