package com.hash;

import java.util.HashSet;

class Student{
	int id;
	String name;
	/**
	 * @param id
	 * @param name
	 */
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		
		return this.id;
	}
	
	
}

public class EqualsMethodEx {
	public static void main(String[] args) {
		Student std=new Student(1,"abc");
		Student std1=new Student(1,"abc");
		Student std2=new Student(2,"abc");
		Student std3=new Student(3,"abc");
		Student std4=new Student(4,"abc");
		Student std5=new Student(5,"abc");
		HashSet<Student> hs=new HashSet<>();
		hs.add(std5);
		hs.add(std4);
		hs.add(std3);
		hs.add(std2);
		hs.add(std1);
		hs.add(std);
	System.out.println(hs);

}

}

