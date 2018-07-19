package designMode.观察者模式.观察者;

import java.util.ArrayList;
import java.util.List;

public class Subject {
   private List<Observer> observerList = new ArrayList<>();
   public void attatch(Observer observer){
      observerList.add(observer);
   }
   public void detach(Observer observer){
      observerList.remove(observer);
   }
   public void Notify(){
      for(Observer observer:observerList){
         observer.update();
      }
   }

}
