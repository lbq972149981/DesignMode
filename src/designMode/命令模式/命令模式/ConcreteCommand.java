package designMode.命令模式.命令模式;

public class ConcreteCommand implements Command{
   private Receiver receiver;

   public ConcreteCommand(Receiver receiver) {
      this.receiver = receiver;
   }

   @Override
   public void execute() {
      receiver.sendMessage();
   }
}
