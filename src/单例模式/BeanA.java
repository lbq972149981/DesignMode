package 单例模式;

/**
 * 恶汉式：适合经常用
 */
public class BeanA {
   private BeanA(){

   }
   private static BeanA beanA = new BeanA();
   public static BeanA getBeanA() {
      return beanA;
   }
}
