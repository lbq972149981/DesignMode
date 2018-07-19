package designMode.装饰者模式.装饰者;

public class Test {
   public static void main(String[] args) {
      Girl girl = new AmericanGirl();
      System.out.println(girl.getDesc());
      Coding coding = new Coding(girl);
      System.out.println(coding.getDesc());
      Art art = new Art(coding);
      System.out.println(art.getDesc());
      System.out.println(new Coding(new Art(new ChineseGirl())).getDesc());
   }
}
