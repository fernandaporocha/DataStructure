package ie.fernandarocha.test;

import java.util.ArrayList;

import ie.fernandarocha.Student;

public class Test {
	public static void main(String[] args) {
		ArrayList vector = new ArrayList();
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		vector.add(student1);
		vector.add(student2);
		vector.add(0, student3);
		int tamanho = vector.size();
		if (tamanho != 3) {
			System.out.println("Erro: The list size is wrong");
		}
		if (!vector.contains(student1)) {
			System.out.println("Erro: It didn't find a student that should be in the list");
		}
		vector.remove(0);
		tamanho = vector.size();
		if (tamanho != 2) {
			System.out.println("Erro: The list size is wrong.");
		}
		if (vector.contains(student3)) {
			System.out.println("Erro: It found a student that shouldn't be un the list.");
		}
	}
}