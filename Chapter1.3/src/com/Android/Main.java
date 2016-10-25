package com.Android;
// this will  all classes  from  the  com.Building.Residential.* such as  Bungalow and semiDetached;

import com.Building.Residential.*;

import java.util.Random;

import com.Building.*;

// this import the exam q1 class only.
import com.Exam.ExamQ1;
import com.Exam.ExamQ2;

// this is a special type of imports , ie only the statics 
// the statics in this class is getmarks and static  int marks

import com.Exam.ExamQ2.*;
import com.Exam.Test;
import com.Exam.Test;

public class Main {

	public static void main(String[] args) {
		// exam objective 1.4 , import other packages to make them accessible in
		// your code
		System.out.println("test out");

		// we can do that because we have import these classes from the
		// com.Building.Residential.*
		//

		Bungalow smallHouse = new Bungalow();

		SemiDetached biggerHouse = new SemiDetached();

		SkyScaper tallBuilding = new SkyScaper();

		/*
		 * we can create this as we have imported the com.Exam.ExamQ1;
		 * 
		 * 
		 * 
		 */
		Random rand = new Random(System.currentTimeMillis());
		 double ran =  (Math.random() * -1000 * Math.random());
		
		System.out.println("ran num ="+ ran);
		
		System.out.println("ran num2 ="+ rand);

		

		ExamQ1 exam1 = new ExamQ1();

		com.Exam.Test myTest = new com.Exam.Test();
		
		
		System.out.println(ExamQ2.marks);
		
		
		ExamQ2.getMarks();
		
		
		Test.result();
		
		

	}

}
