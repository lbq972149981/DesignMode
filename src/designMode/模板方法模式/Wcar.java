package designMode.模板方法模式;

/**
 * @author liubaoqing
 * @createTime 2018-08-01
 * @description 大众车
 */
public class Wcar extends CarModel{
   @Override
   protected void start() {
      System.out.println("大众车启动");
   }

   @Override
   protected void stop() {
      System.out.println("大众车停止");
   }
}
