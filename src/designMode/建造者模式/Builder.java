package designMode.建造者模式;

public abstract class Builder {
   //第一步：装CPU
   public abstract void  BuildCPU();
   //第二步：装主板
   public abstract void BuildMainboard();
   //第三步：装硬盘
   public abstract void BuildHD();
   //返回产品的方法：获得组装好的电脑
   public abstract Computer GetComputer();
}
