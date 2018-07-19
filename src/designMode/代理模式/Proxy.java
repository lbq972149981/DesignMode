package designMode.代理模式;

public class Proxy implements NetWork{
   private NetWork network;
   public Proxy(NetWork network) {// 设置代理的真实操作
      this.network = network; // 设置代理的子类
   }
   public void check() { // 身份验证操作
      System.out.println("检查用户是否合法！");
   }
   public void browse() {
      this.check(); // 调用具体的代理业务操作
      this.network.browse(); // 调用真实的上网操作
   }
}
