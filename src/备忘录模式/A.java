package 备忘录模式;

import java.util.ArrayList;
import java.util.List;

public class A {
   private String key = "A";
   public List<String> list = new ArrayList<>();
   public void do1(){
      list.add("do 1");
      list.add("do 2");
      list.add("do 3");
   }
   public void do2(){
      list.set(0,"do 4");
      list.set(1,"do 5");
      list.set(2,"do 6");
   }
   public void createMeno(){
      MemoManage.addMemo(key,new memoA());
   }
   public void getMemo(){
      list = ((memoA)MemoManage.getMemo(key)).getMemoList();
   }
   public void presentInfor(){
      System.out.println(list.toString());
   }
   private class memoA implements ImemoInfor{
      private List<String> memoList = null;

      public memoA() {
         memoList = new ArrayList<>(list);
      }
      public List<String> getMemoList(){
         return memoList;
      }
   }
}
