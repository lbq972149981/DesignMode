package designMode.观察者模式.观察者;

public class ConcreteSubject extends Subject{
   private String message;

   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }
}
