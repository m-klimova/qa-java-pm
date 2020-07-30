package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Student;

class TestStudentAvgGrade {
	
	// private local variable of Student class type
	private Student myStudent;

	@BeforeEach
	void setUp() throws Exception {
		HashMap<String, Double> courses = new HashMap<String, Double>() {{
			put("Algebra II", 4.5);
			put("DIU I", 3.5);
			put("Geomethry", 5.5);
		}};
		
		myStudent = new Student("Doncho Donchev", "aa@aa.com", "+359023874",
				"FN12345", "FMI", courses);
	}

	@Test
	void checkAvgGrade() {
		assertTrue(myStudent.calculateAvgGrade() == 4.5, "Wrong calculation - check again!");
		// fail("Not yet implemented");
	}
	
	@Test
	void checkNegativeAvgGrade() {
		assertFalse(myStudent.calculateAvgGrade() > 0, "Wrong calculation - check again!");
		// fail("Not yet implemented");
	}
	

}
