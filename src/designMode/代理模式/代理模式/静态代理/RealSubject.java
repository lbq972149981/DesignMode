package designMode.代理模式.代理模式.静态代理;

public class RealSubject implements Subject{
   @Override
   public void say() {
      System.out.println("你好，这是我真实的话：say");
   }

   @Override
   public void go() {
      System.out.println("你好，这是我真实的话:go");
   }
}
