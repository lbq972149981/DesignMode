package designMode.享元模式;

/**
 * @author liubaoqing
 * @createTime 2018-08-01
 * @description
 */
public class test {
   public static void main(String[] args) {
      FlyweightFactory factory = new FlyweightFactory();
      Flyweight c1 = factory.factory("AAA");
      Flyweight c2 = factory.factory("AAA");
      System.out.println(c1 == c2);//true
   }
}
