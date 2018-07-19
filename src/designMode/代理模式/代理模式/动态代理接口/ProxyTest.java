package designMode.代理模式.代理模式.动态代理接口;
import java.lang.reflect.Proxy;
public class ProxyTest {
   public static void main(String[] args) {
      Subject subject = new RealSubject();
      MyProxy myProxy = new MyProxy(subject);
      Object object = Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),myProxy);
      Subject s = (Subject)object;
      s.go();
      s.say();
   }
}
