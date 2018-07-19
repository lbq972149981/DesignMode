package designMode.门面模式_外观模式;

import java.util.logging.Logger;


public class Client {
   public static final Logger LOGGER = Logger.getLogger(Client.class.toString());
   public static void main(String[] args)
   {
      Computer computer = new Computer();
      computer.start();
      System.out.println("-----------------------------");
      computer.shutDown();
   }
}