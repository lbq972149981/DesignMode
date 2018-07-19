package 命令模式;

public class 教师Command implements Command{
   private 教师执行者 js;

   public 教师Command(教师执行者 js) {
      this.js = js;
   }

   @Override
   public void 执行() {
      js.教师();
   }
}
