package comparablesAndcomparator;

public class Student implements Comparable<Student> {

	int mark;
	String name;
	public Student(int mark, String name) {
		super();
		this.mark = mark;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [mark=" + mark + ", name=" + name + "]";
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student obj) {
		if(this.mark > obj.mark) return -1;
		else if(this.mark < obj.mark) return 1;
		return 0;
	}
		
	

}
