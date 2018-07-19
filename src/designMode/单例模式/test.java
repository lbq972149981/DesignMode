package designMode.单例模式;

public class test {
   public static void main(String[] args) {
      SingletonTest s = SingletonTest.getIstance();
      SingletonTest1 s1 = SingletonTest1.getInstance();
      SingletonTest2 s2 = SingletonTest2.getIstance();
   }
}
