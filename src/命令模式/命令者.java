package 命令模式;

public class 命令者 {
  public Command command;

   public 命令者(Command command) {
      this.command = command;
   }
   public void action(){
      command.执行();
   }
}
