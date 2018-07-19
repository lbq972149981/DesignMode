package designMode.观察者模式.观察者;

public class ConcreteObserver extends Observer{
   private ConcreteSubject concreteSubject;
   private String name;

   public ConcreteObserver(ConcreteSubject concreteSubject, String name) {
      this.concreteSubject = concreteSubject;
      this.name = name;
   }
   @Override
   public void update() {
      System.out.println(name+"知道了  "+concreteSubject.getMessage());
   }
}
