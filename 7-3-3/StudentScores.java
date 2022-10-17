public class StudentScores {
	private final int MAX_STUDENTS = 100;
	
	private Student[] Student; 
	private int numStudents;

	public StudentScores() {
		Student = new Student[MAX_STUDENTS];
		numStudents = 0;
	}

	public void add(String name, int score) {
		if (numStudents >= MAX_STUDENTS)
			return; // not enough space to add new student score
		
		Student[numStudents] = new Student(name, score);

		
		numStudents++;
	}

	public String getHighest() {
		if (numStudents == 0) 
			return null;

		int highest = 0;

		for (int i = 1; i < numStudents; i++)
			if (Student[i].Score() > Student[highest].Score())
				highest = i;

		return Student[highest].Name();
	}

	public String getLowest() {
		if (numStudents == 0)
			return null;

		int lowest = 0;

		for (int i = 1; i < numStudents; i++)
			if (Student[i].Score() < Student[lowest].Score())
				lowest = i;

		return Student[lowest].Name();
	}
}
