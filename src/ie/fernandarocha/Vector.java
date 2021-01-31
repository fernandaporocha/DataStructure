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
		if(!this.isValidPositon(position)) {
			throw new IllegalArgumentException("Invalid Position");
		}
		
		for (int i = this.studentTotal -1; i >= position; i--) {
			this.students[i+1] = this.students[i];
		}
		
		this.students[position] = student;
		this.studentTotal++;
	}
	
	public Student get(int position) {
		if(!this.isPositonOccupied(position)) {
			throw new IllegalArgumentException("Invalid Position");
		}
		return this.students[position];
	}
	
	public void remove(int position) {
		if (!this.isPositonOccupied(position)) {
			throw new IllegalArgumentException("Invalid position");
		}
		for(int i = position; i < this.studentTotal -1; i++) {
			this.students[i] = this.students[i+1];
		}
		this.studentTotal--;
	}
	
	public boolean contains(Student student) {
		for (int i = 0; i < this.studentTotal; i++) {
			if (student.equals(this.students[i])) {
				return true;
			}
		}
		return false;
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
	
	private boolean isPositonOccupied(int position) {
		return position >=0 && position < this.studentTotal;
	}
	
	private boolean isValidPositon(int position) {
		return position >=0 && position <= this.studentTotal;
	}
	
	private void checkSize() {
		if(this.studentTotal == this.students.length) {
			Student[] newArray = new Student[this.students.length*2];
			for (int i = 0; i < this.students.length; i++) {
				newArray[i] = this.students[i];
			}
			this.students = newArray;
		}
	}

}
