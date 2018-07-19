package designMode.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HomeLine implements InvocationHandler{
   private Person target;
   public Object getInstance(Person target){
      this.target = target;
      Class c = target.getClass();
      Object obj = Proxy.newProxyInstance(c.getClassLoader(),c.getInterfaces(),this);
      return obj;
   }
   @Override
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      System.out.println("我是链家，我帮别人找房子..");
      //第一个参数是target,也就是被代理类的对象；第二个参数是方法中的参数
      method.invoke(target, args);
      System.out.println("我是链家，已经找完了..");
      return null;
   }
}
