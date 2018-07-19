package designMode.命令模式.命令模式;

public class Invoker {
   public void go(Command command){
      command.execute();
   }
}
