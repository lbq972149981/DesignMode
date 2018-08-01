package designMode.状态模式;

/**
 * @author liubaoqing
 * @createTime 2018-08-01
 * @description
 */
public class Test {
   public static void main(String[] args) {
      Student student = new Student();
      student.perform();
      student.change();
      student.perform();
   }
}
