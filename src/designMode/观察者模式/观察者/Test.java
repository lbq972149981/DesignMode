package designMode.观察者模式.观察者;

public class Test {
   public static void main(String[] args) {
      ConcreteSubject concreteSubject = new ConcreteSubject();
      concreteSubject.attatch(new ConcreteObserver(concreteSubject,"tom"));
      concreteSubject.attatch(new ConcreteObserver(concreteSubject,"Amy"));
      concreteSubject.attatch(new ConcreteObserver(concreteSubject,"Daming"));
      concreteSubject.setMessage("今天放假");
      concreteSubject.Notify();
      concreteSubject.setMessage("费奕玮不可以放假");
      concreteSubject.Notify();
   }
}
