package 工厂模式Test.简单工厂;

import org.junit.Test;
import 工厂模式Test.例.H苹果;
import 工厂模式Test.例.fruit;
import 工厂模式Test.例.H香蕉;

public class fruitFactory {
   @Test
   public void test(){
      fruit ff = fruitFactory.getfruit("S香蕉");
      ff.卖水果();
   }
   public static fruit getfruit(String type){
      fruit ff = null;
      if("S苹果".equals(type)){
         ff = new H苹果();
      }else if("S香蕉".equals(type)){
         ff = new H香蕉();
      }
      return ff;
   }
}
