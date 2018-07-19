package designMode.门面模式_外观模式;

import java.util.logging.Logger;

public class Computer {
   public static final Logger LOGGER = Logger.getLogger(Computer.class.toString());

   private CPU cpu;
   private Memory memory;
   private Disk disk;
   public Computer()
   {
      cpu = new CPU();
      memory = new Memory();
      disk = new Disk();
   }
   public void start()
   {
      System.out.println("Computer start begin");
      cpu.start();
      disk.start();
      memory.start();
      System.out.println("Computer start end");
   }

   public void shutDown()
   {
      System.out.println("Computer shutDown begin");
      cpu.shutDown();
      disk.shutDown();
      memory.shutDown();
      System.out.println("Computer shutDown end...");
   }
}
