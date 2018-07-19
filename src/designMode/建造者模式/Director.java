package designMode.建造者模式;

public class Director {
   //指挥装机人员组装电脑
   public void Construct(Builder builder){
      builder. BuildCPU();
      builder.BuildMainboard();
      builder. BuildHD();
   }
}
