package programming;

import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

		printOddNumbersInListFunctional(numbers);
		
		List<String> courses = 
				List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		printAllCourses(courses);
		printSpringCourses(courses);
		printFourLettersCourses(courses);
	}
		
	// 1. 홀수만 출력
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2 == 1)
			.forEach(System.out::println);
	}
	
	// 2. 전체 코스 출력
	private static void printAllCourses(List<String> courses) {
		courses.stream()
			.forEach(System.out::println);
	}

	// 3. "Spring"이 포함된 코스만 출력
	private static void printSpringCourses(List<String> courses) {
		courses.stream()
			.filter(course -> course.contains("Spring")) // contains: 
			.forEach(System.out::println);
	}
	
	// 4. 4글자 이상 코스만 출력
	private static void printFourLettersCourses(List<String> courses) {
		courses.stream()
			.filter(course -> course.length() >= 4)
			.forEach(System.out::println);
	}
}
