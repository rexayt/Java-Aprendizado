package entities;

import java.util.Objects;

public class Student {
	public Integer id;
	
	public Student(Integer id) {
		this.id = id;
	}
	
	public String toString() {
		return String.format("%d", this.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
