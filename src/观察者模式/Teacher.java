package 观察者模式;

import java.util.Observable;
import java.util.Observer;

public class Teacher extends Observable{
   public String status;

   public Teacher() {
      status = "上课";
   }
   @Override
   public void notifyObservers() {
      super.notifyObservers();
   }
   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
      this.setChanged();
      notifyObservers();
   }
}
