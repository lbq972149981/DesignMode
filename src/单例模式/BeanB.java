package 单例模式;

/**
 * 懒汉式
 */
public class BeanB {
   private BeanB(){

   }
   private static BeanB beanB;
   public static BeanB getBeanB() {
      if(beanB==null){
         beanB = new BeanB();
      }
      return beanB;
   }
}
