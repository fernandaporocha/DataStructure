package ie.fernandarocha.test;

import ie.fernandarocha.Student;
import ie.fernandarocha.Vector;

public class RemoveByPositionTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setName("Rafael");
		s2.setName("Paulo");
		Vector list = new Vector();
		list.add(s1);
		list.add(s2);
		list.remove(0);
		System.out.println(list);
	}
}