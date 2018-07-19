package 工厂模式.简单工厂;

import org.junit.Test;
import 工厂模式.例.Ididi;
import 工厂模式.例.专车;
import 工厂模式.例.出租车;
import 工厂模式.例.快车;

public class DiDiFactory {
   @Test
   public void test(){
      DiDiFactory.getFactory("快车").打车();
   }
   public static Ididi getFactory(String type){
      Ididi di= null;
      if("快车".equals(type)){
         di = new 快车();
      }else if("出租车".equals(type)){
         di = new 出租车();
      }else if("专车".equals(type)){
         di = new 专车();
      }
      return di;
   }
}
