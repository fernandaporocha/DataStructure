package ie.fernandarocha;

public class Vector {
	
	private Object[] objects = new Object[100];
	private int studentTotal = 0;
	
	public void add(Student student) {
		this.checkSize();
		this.objects[this.studentTotal] = student;
		this.studentTotal++;
	}
	
	public void add(int position, Student student) {
		this.checkSize();
		if(!this.isValidPositon(position)) {
			throw new IllegalArgumentException("Invalid Position");
		}
		
		for (int i = this.studentTotal -1; i >= position; i--) {
			this.objects[i+1] = this.objects[i];
		}
		
		this.objects[position] = student;
		this.studentTotal++;
	}
	
	public Object get(int position) {
		if(!this.isPositonOccupied(position)) {
			throw new IllegalArgumentException("Invalid Position");
		}
		return this.objects[position];
	}
	
	public void remove(int position) {
		if (!this.isPositonOccupied(position)) {
			throw new IllegalArgumentException("Invalid position");
		}
		for(int i = position; i < this.studentTotal -1; i++) {
			this.objects[i] = this.objects[i+1];
		}
		this.studentTotal--;
	}
	
	public boolean contains(Student student) {
		for (int i = 0; i < this.studentTotal; i++) {
			if (student.equals(this.objects[i])) {
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
			builder.append(this.objects[i]);
			builder.append(", ");
		}
		
		builder.append(this.objects[this.studentTotal -1]);
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
		if(this.studentTotal == this.objects.length) {
			Object[] newArray = new Object[this.objects.length*2];
			for (int i = 0; i < this.objects.length; i++) {
				newArray[i] = this.objects[i];
			}
			this.objects = newArray;
		}
	}

}
