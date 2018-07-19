package designMode.观察者模式;

import java.util.Observable;
public class House extends Observable {
   private float price;
   public void setPrice(float price) {
      this.setChanged();// 设置变化点
      this.notifyObservers(price);// 通知所有观察者价格改变
      this.price = price;
   }
   public float getPrice() {
      return this.price;
   }
   public House(float price) {
      this.price = price;
   }
   public String toString() {
      return "房子价格为: " + this.price;
   }
}
