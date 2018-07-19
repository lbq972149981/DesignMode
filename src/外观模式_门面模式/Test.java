package 外观模式_门面模式;

/**
 * 方法聚合
 * 让用户看到更少的信息
 */
public class Test {
	public static void main(String[] args) {
		Studentmethds sm = new Student();
		sm.技能点();
	}
}
