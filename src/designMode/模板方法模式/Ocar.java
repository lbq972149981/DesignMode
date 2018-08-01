package designMode.模板方法模式;

/**
 * @author liubaoqing
 * @createTime 2018-08-01
 * @description
 */
public class Ocar extends CarModel{
   @Override
   protected void start() {
      System.out.println("奥迪 无钥匙启动");
   }

   @Override
   protected void stop() {
      System.out.println("奥迪停车");
   }
}
