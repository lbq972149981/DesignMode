package designMode.代理模式;

public class ProxyTest {
   public static void main(String args[]) {
      NetWork net = null; // 定义接口对象
      net = new Proxy(new Real()); // 实例化代理，同时传入代理的真实操作
      net.browse(); // 调用代理的上网操作
   }
}
