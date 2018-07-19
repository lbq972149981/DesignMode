package 迭代器模式;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {
	/**
	 * 迭代器
	 * 容器类实现Collection接口
	 * Collection接口继承Iterable接口，使容器类都应实现迭代器接口的方法,每种容器类的实现不同
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList<>(); 
		Set s =  new HashSet<>();
		ArrayList l = null;
		System.out.println(l);
	}

}
