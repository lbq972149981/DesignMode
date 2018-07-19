package designMode.命令模式;

public class LightOffCommand implements Command{
   private Receiver receiver;
   public LightOffCommand(Receiver receiver) {
      this.receiver = receiver;
   }
   @Override
   public void execute() {
      this.receiver.turnOFF();
   }
}
