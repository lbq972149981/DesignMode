package designMode.命令模式;

public class CommandTest {
   public static void main(String[] args) {
      Receiver receiver = new Receiver();
      Invoker invoker = new Invoker();
      Command turnOnLight = new LightOnCommand(receiver);
      Command turnOffLight = new LightOffCommand(receiver);
      invoker.execute(turnOnLight);
      invoker.execute(turnOffLight);
   }
}
