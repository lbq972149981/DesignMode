package designMode.代理模式.代理模式.动态代理接口;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler{
   private Object object;
   public MyProxy(Object object){
      this.object = object;
   }
   @Override
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      System.out.println("代理器之前的运行");
      method.invoke(object,args);
      System.out.println("代理器之后的运行");
      return object;
   }
}
