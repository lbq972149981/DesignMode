package designMode.装饰者模式.装饰者;

public class Coding extends GirlDecorator{
   private Girl girl;

   public Coding(Girl girl) {
      this.girl = girl;
   }

   @Override
   public String getDesc() {
      return this.girl.getDesc()+";并且会编码";
   }
}
