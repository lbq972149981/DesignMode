package 命令模式;

public class 保洁Command implements Command{
   private 保洁执行者 bj;

   public 保洁Command(保洁执行者 bj) {
      this.bj = bj;
   }

   @Override
   public void 执行() {
      bj.保洁();
   }
}
