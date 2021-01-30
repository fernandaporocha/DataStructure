package ie.fernandarocha.test;

import ie.fernandarocha.Student;
import ie.fernandarocha.Vector;

public class AddByPositionTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.setName("Rafael");
		s2.setName("Paulo");
		s3.setName("Ana");
		
		Vector list = new Vector();
		list.add(s1);
		list.add(0, s2);
		list.add(1, s3);
		System.out.println(list);
	}
}