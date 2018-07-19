package designMode.命令模式;

public class LightOnCommand implements Command{
   private Receiver receiver;
   public LightOnCommand(Receiver receiver) {
      this.receiver = receiver;
   }
   @Override
   public void execute() {
      this.receiver.turnON();
   }
}
