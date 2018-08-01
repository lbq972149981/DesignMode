package designMode.模板方法模式;

/**
 * @author liubaoqing
 * @createTime 2018-08-01
 * @description
 */
public abstract class CarModel {
   //汽车启动
   protected abstract void start();
   //汽车停止
   protected abstract void stop();
   //用户并不需要关注你的车怎么启动或者停下来的，可以开可以停就可以啦
   final public void exect(){
      this.start();
      this.stop();
   }
}
