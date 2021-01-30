package ie.fernandarocha.test;

import ie.fernandarocha.Student;
import ie.fernandarocha.Vector;

public class ListSizeTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.setName("Rafael");
		s2.setName("Paulo");
		Vector list = new Vector();
		list.add(s1);
		list.add(s2);
		System.out.println(list.size());
		list.add(s3);
		System.out.println(list.size());
	}
}