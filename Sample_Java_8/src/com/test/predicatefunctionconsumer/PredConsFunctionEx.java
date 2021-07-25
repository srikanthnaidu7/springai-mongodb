package com.test.predicatefunctionconsumer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredConsFunctionEx {

	public static void main(String[] args) {

		
		//Function functional Interface apply()arg return result after applying
		Function<Student,String> function = student->{
			String grade = "";
			if(student.marks >= 80) {
				grade = "A[Grade]";
			}else if(student.marks >= 70) {
				grade = "B[Grade]";
			}else if(student.marks >= 60) {
				grade = "C[Grade]";
			}else {
				grade = "D[Failed]";
			}
			return grade;
			
		};
		//consumer interface accept(arg) take arg nothing return
		Consumer<Student> consumer = student->{
			System.out.println("Student Name:"+student.name + " Student Marks: "+student.marks
					+ " Grade :"+function.apply(student));
		};
		
		//Predicate interface using the test(arg) return true or false
		Predicate<Student> predicate=(student)->student.marks>=80; 
		
		Student stu[] = {new Student("Sri", 80),
				new Student("Hari", 70),
				new Student("Siva", 60),
				new Student("Rama", 50)};
		
		for(Student student : stu) {
			
			if(predicate.test(student)) {
				consumer.accept(student);
			}
		}
		
		
		
	}

}
