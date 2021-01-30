package ie.fernandarocha;

import java.util.Arrays;

public class Vector {
	
	private Student[] students = new Student[100];
	
	public void add(Student student) {
		for(int i = 0; i < this.students.length; i++) {
			if(this.students[i]==null) {
				this.students[i] = student;
				break;
			}
		}	
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
