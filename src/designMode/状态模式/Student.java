package designMode.状态模式;

/**
 * @author liubaoqing
 * @createTime 2018-08-01
 * @description
 */
public class Student {
   private State state = new HappyState();
   public void change(){
      state = new SadState();
   }
   public void perform(){
      state.exectState();
   }
}

