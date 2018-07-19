package designMode.门面模式_外观模式;

import java.util.logging.Logger;

public class Memory {
   public static final Logger LOGGER = Logger.getLogger(Memory.class.toString());
   public void start()
   {
      System.out.println("Memory is start...");
   }

   public void shutDown()
   {
      System.out.println("Memory is shutDown...");
   }
}

