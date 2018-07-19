package 观察者模式;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer{

   public String status;
   public Student() {
      status = "上课";
   }

   @Override
   public void update(Observable o, Object arg) {
      Teacher t = (Teacher)o;
      status = t.getStatus();
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }
   public void show(){
      if("上课".equals(status)){
         System.out.println("上课");
      }else {
         System.out.println("不上课");
      }
   }
}
