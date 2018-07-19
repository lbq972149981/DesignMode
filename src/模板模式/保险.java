package 模板模式;

public class 保险 {
   public void 提交信息(){
      System.out.println("提交信息");
   }
   public boolean 医院检测(){
      return false;
   }
   public boolean 审核(){
      return true;
   }
   public boolean 车险(){
      return  false;
   }
   public void 申请成功(){
      System.out.println("申请成功");
   }
   final public void 申请过程(){
      提交信息();
      if(医院检测()){
         System.out.println("检测成功");
      }
      if(车险()){
         System.out.println("打8.5折");
      }
      if(审核()){
         System.out.println("审核成功");
      }
      申请成功();
   }
}
