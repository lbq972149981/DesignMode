package designMode.适配器模式.Adapter;

public class MyObjectAdapter implements Telephone{
   Chapai chapai = new Chapai();
   @Override
   public void tele() {
     chapai.chongdian();
   }
}
