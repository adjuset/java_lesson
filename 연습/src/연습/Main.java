package 연습;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<U> list = new ArrayList<>();
		
		list.add(new U(23,"모모"));
		list.add(new U(11,"사나"));
		list.add(new U(35,"마나"));
		list.add(new U(34,"주겅"));
		
		list.sort(null);
		System.out.println(list);
		
		
		
	}

}
