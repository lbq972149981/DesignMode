package 备忘录模式;

import java.util.HashMap;

public class MemoManage {
   private static HashMap<String,ImemoInfor> memoinfor = new HashMap<>();
   public static void addMemo(String key,ImemoInfor value){
      memoinfor.put(key,value);
   }
   public static ImemoInfor getMemo(String key){
      return memoinfor.get(key);
   }
}
