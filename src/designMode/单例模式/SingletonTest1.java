package designMode.单例模式;
/**
 * 单例模式的实现：懒汉式,非线程安全
 */
public class SingletonTest1 {
      private SingletonTest1() {
      }
      private static SingletonTest1 instance;
      public static SingletonTest1 getInstance() {
         if (instance == null)
            instance = new SingletonTest1();
         return instance;
      }
}
