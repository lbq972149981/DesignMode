package 访问者模式;

import java.util.ArrayList;
import java.util.List;

public class Test {
   public static void main(String[] args) {
      List<ColinStu> list = new ArrayList<>();
      for(int i=0;i<5;i++){
         list.add(new ColinStu());
      }
      for(ColinStu stu:list){
         stu.accept(new Visitor() {
            @Override
            public void doSth(Accept acc) {
               if(acc instanceof ColinStu){
                  ColinStu stu =(ColinStu)acc;
                  stu.jie = "4";
               }
            }
         });
      }
      for(ColinStu s:list){
         System.out.println(s.jie);
      }
   }
}
