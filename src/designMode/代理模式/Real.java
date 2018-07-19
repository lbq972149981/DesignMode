package designMode.代理模式;
// 真实的上网操作
public class Real implements NetWork{
   @Override
   public void browse() {
      System.out.println("上网浏览信息！");
   }
}
