package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class Test {
   public static void main(String[] args) {
      List<Student> stus = new ArrayList<>();
      Teacher teacher = new Teacher();
      for(int i=0;i<5;i++){
         stus.add(new Student());
         if(i!=3){
            teacher.addObserver(stus.get(i));
         }
         teacher.setStatus("不上课");
         stus.get(i).show();
      }
   }
}
