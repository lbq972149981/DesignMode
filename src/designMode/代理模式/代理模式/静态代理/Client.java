package designMode.代理模式.代理模式.静态代理;

public class Client {
   public static void main(String[] args) {
      Proxy proxy = new Proxy(new RealSubject());
      proxy.go();
      proxy.say();
   }
}
