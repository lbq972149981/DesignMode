package 访问者模式;

public class ColinStu extends Accept{

   public String jie;

   public ColinStu() {
     jie = "3";
   }
   @Override
   public void accept(Visitor visitor) {
      visitor.doSth(this);
   }
}
