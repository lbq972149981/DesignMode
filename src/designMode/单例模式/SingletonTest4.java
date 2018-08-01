package designMode.单例模式;

/**
 * @author liubaoqing
 * @createTime 2018-08-01
 * @description
 */
public class SingletonTest4 {
   String name = "123";
   public static void main(String[] args) {
      SingletonTest4 s1 = SingletonTest4Instance.INSTANCE.getInstance();
      SingletonTest4 s2 = SingletonTest4Instance.INSTANCE.getInstance();
      System.out.println(s1==s2);
   }
}
enum SingletonTest4Instance{
   INSTANCE;
   private SingletonTest4 instance;
   SingletonTest4Instance(){
      instance = new SingletonTest4();
   }
   public SingletonTest4 getInstance(){
      return instance;
   }
}
