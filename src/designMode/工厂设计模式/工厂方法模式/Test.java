package designMode.工厂设计模式.工厂方法模式;

public class Test {
   public static void main(String[] args) {
      new MCDCreator().sell().myProduct();
      new KFCCreator().sell().myProduct();
   }
}
