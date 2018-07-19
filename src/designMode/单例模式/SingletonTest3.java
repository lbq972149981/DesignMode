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

   public static void main(String[] args) {
      SingletonTest3 singleton1 = SingletonTest3.getInstance();
      SingletonTest3 singleton = SingletonTest3.getInstance();
      System.out.println(singleton);
      System.out.println(singleton1);
   }
}
