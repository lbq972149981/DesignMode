package designMode.工厂设计模式.简单工厂模式;

public class Creator {//点餐机
   public IProduct go(int flag){
      switch (flag){
         case 1:
            return new ProductA();
         case 2:
            return new ProductB();
         default:
            return null;

      }
   }
}
