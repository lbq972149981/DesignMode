package 单例模式;

public class Test {
   public static void main(String[] args) {
      BeanA bean1 = BeanA.getBeanA();
      BeanA bean2 = BeanA.getBeanA();
      BeanB bean3 = BeanB.getBeanB();
      BeanB bean4 = BeanB.getBeanB();
      System.out.println(bean1+"==========="+bean2);
      System.out.println(bean3+"==========="+bean4);
   }
}
