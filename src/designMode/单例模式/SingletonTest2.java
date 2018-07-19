package designMode.单例模式;
/**
 * 线程安全  并且效率高
 * 双重锁定板
 */
public class SingletonTest2 {
      /**volatite变量
       * 修饰语句或变量
       * 在jvm层进行同步锁定
       * **/
      private volatile static SingletonTest2 instance;
      private SingletonTest2() {
      }
      public static SingletonTest2 getIstance() {
         if (instance == null) {
            synchronized (SingletonTest2.class) {
               if (instance == null) {
                  instance = new SingletonTest2();
               }
            }
         }
         return instance;
      }
}
