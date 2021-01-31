package ie.fernandarocha.test;

import ie.fernandarocha.Student;
import ie.fernandarocha.Vector;

public class GetByPositionTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setName("Rafael");
		s2.setName("Paulo");
		Vector list = new Vector();
		list.add(s1);
		list.add(s2);
		Student student1 = (Student)list.get(0);
		Student student2 = (Student)list.get(1);
		System.out.println(student1);
		System.out.println(student2);
	}
}
