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
		return this.studentTotal;
	}
	
	public String toString() {
		
		if(this.studentTotal == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i < this.studentTotal -1; i++) {
			builder.append(this.students[i]);
			builder.append(", ");
		}
		
		builder.append(this.students[this.studentTotal -1]);
		builder.append("]");
		return builder.toString();
	}

}
