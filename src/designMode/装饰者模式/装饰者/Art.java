package designMode.装饰者模式.装饰者;

public class Art extends GirlDecorator{
   private Girl girl;

   public Art(Girl girl) {
      this.girl = girl;
   }

   @Override
   public String getDesc() {
      return this.girl.getDesc()+";我会绘画";
   }
}
