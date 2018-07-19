package designMode.门面模式_外观模式;

import java.util.logging.Logger;

public class CPU {
   public static final Logger LOGGER = Logger.getLogger(CPU.class.toString());
   public void start()
   {
      System.out.println("cpu is start...");
   }

   public void shutDown()
   {
      System.out.println("CPU is shutDown...");
   }
}
