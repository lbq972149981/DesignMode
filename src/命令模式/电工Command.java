package 命令模式;

public class 电工Command implements Command{
   private 电工执行者 dg;

   public 电工Command(电工执行者 dg) {
      this.dg = dg;
   }

   @Override
   public void 执行() {
      dg.电工();
   }
}
