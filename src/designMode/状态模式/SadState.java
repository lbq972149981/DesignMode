package designMode.状态模式;

/**
 * @author liubaoqing
 * @createTime 2018-08-01
 * @description
 */
//相当于状态模式中的ConcreteStateSubclassess
public class SadState implements State{
   @Override
   public void exectState() {
      System.out.println("SadState");
   }
}
