package designMode.代理模式.动态代理;

public class Master implements Person{
   @Override
   public void searchHouse() {
      System.out.println("我是Master，我要找房子，一室一厅!");
   }
}
