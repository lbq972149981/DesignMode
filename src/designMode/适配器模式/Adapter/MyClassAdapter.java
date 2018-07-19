package designMode.适配器模式.Adapter;

public class MyClassAdapter extends Chapai implements Telephone{
   @Override
   public void tele() {
      super.chongdian();
   }
}
