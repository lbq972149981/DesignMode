package designMode.代理模式.动态代理;

public class Test {
   public static void main(String[] args) {
      Person person = (Person)new HomeLine().getInstance(new Master());
      person.searchHouse();
   }
}
