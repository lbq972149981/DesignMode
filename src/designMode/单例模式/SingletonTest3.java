package designMode.单例模式;
/**
 * 线程安全  并且效率高
 *
 */
public class SingletonTest3 {
      private SingletonTest3(){

      }
      private static class SingletonHolder{
         private static final SingletonTest3 singletonInstance = new SingletonTest3();
      }
      private static SingletonTest3 getInstance(){
        return SingletonHolder.singletonInstance;
      }

}
