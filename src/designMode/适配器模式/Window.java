package designMode.适配器模式;
public interface Window {
   public void open();// 窗口打开
   public void close();// 窗口关闭
   public void iconified();// 窗口最小化
   public void deiconified();// 窗口恢复
   public void activated();// 窗口活动
}
