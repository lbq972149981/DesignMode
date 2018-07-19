package designMode.适配器模式;

public class AdapterTest {
   public static void main(String[] args) {
      WindowImpl window = new WindowImpl();
      window.open();
      window.close();
   }
}
