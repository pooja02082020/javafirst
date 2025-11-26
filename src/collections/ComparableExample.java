package collections;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
 int roll;
 int marks;
 
 Student(int roll,int marks){
	 this.roll =roll;
	 this.marks = marks;
 }
 
 @Override
 public int compareTo(Student s) {
	 return this.marks = s.marks;
 }
}

 public  class ComparableExample{
		public static void main(String[] args) {
			Student s1= new Student(101,75);
			Student s2= new Student(102,64);
			Student s3= new Student(104,85);
			Student s4= new Student(105,65);
			
			List<Student>list = Arrays.asList(s1,s2,s3,s4);
			Collections.sort(list);
			for(Student s:list) {
				System.out.println(s.roll+ " "+s.marks);
			}
			
		}
	}
