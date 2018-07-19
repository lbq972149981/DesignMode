package designMode.单例模式;
/**
 * 单例模式的实现：饿汉式,线程安全 但效率比较低
 */
public class SingletonTest {
   private SingletonTest() {
   }
   private static final SingletonTest instance = new SingletonTest();
   public static SingletonTest getIstance() {
      return instance;
   }
}
