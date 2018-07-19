package 命令模式;

public class Test {
   public static void main(String[] args) {
      命令者 bj = new 命令者(new 保洁Command(new 保洁执行者()));
      bj.action();
   }
}
