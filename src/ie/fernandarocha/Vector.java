package ie.fernandarocha;

import java.util.Arrays;

public class Vector {
	
	private Student[] students = new Student[100];
	private int studentTotal = 0;
	
	public void add(Student student) {
		this.students[this.studentTotal] = student;
		this.studentTotal++;
	}
	
	public void add(int position, Student student) {
		
	}
	
	public Student get(int position) {
		
	}
	
	public void remove(int position) {
		
	}
	
	public boolean contains(Student student) {
		
	}
	
	public int size() {
		
	}
	
	public String toString() {
		return Arrays.toString(students);
	}

}
