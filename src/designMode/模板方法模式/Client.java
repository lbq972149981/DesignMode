package designMode.模板方法模式;

/**
 * @author liubaoqing
 * @createTime 2018-08-01
 * @description
 */
public class Client {
   public static void main(String[] args) {
      CarModel wcar = new Wcar();
      wcar.exect();
      CarModel ocar = new Ocar();
      ocar.exect();
   }
}
