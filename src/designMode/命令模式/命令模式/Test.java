package designMode.命令模式.命令模式;

public class Test {
   public static void main(String[] args) {
      Receiver receiver = new Receiver();
      Command command = new ConcreteCommand(receiver);
      Invoker invoker = new Invoker();
      invoker.go(command);
   }
}
