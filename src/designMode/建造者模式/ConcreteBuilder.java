package designMode.建造者模式;
//装机人员1
public class ConcreteBuilder extends Builder{
   //创建产品实例
   Computer computer = new Computer();

   @Override
   public void BuildCPU() {
      computer.Add("组装CPU");
   }
   @Override
   public void BuildMainboard() {
      computer.Add("组装主板");
   }
   @Override
   public void BuildHD() {
      computer.Add("组装硬盘");
   }
   //返回组装成功的电脑
   @Override
   public Computer GetComputer() {
      return computer;
   }
}
