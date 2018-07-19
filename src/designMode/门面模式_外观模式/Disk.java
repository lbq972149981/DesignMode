package designMode.门面模式_外观模式;

import java.util.logging.Logger;

public class Disk {
   public static final Logger LOGGER = Logger.getLogger(Disk.class.toString());
   public void start()
   {
      System.out.println("Disk is start...");
   }

   public void shutDown()
   {
      System.out.println("Disk is shutDown...");
   }
}
