package designMode.适配器模式;

public class WindowImpl extends WindowAdapter{
   public void open() {
      System.out.println("窗口打开");// 实现open()方法
   }
   public void close() {
      System.out.println("窗口关闭");// 实现close()方法
   }
}
