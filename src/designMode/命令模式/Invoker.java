package designMode.命令模式;

public class Invoker {
   public void execute(Command command){
      command.execute();
   }
}
