class Exam {
	String message;
	double price;
	boolean status;

	public Exam() {
		this.message = "Good luck";
	}

	public Exam(String period, String level) {
	}

	public double getPrice() {
		return price;
	}

	public boolean isFinished() {
		return status;
	}
}

class Midterm extends Exam {

	public Midterm() {
		super();
		System.out.println("Exam has started.");
	}
}

class Essay extends Midterm {
}

class Quiz {
}

public class Main {
	public static void main(String[] args) {
		Exam exam = new Exam();
		System.out.println(exam.message);

		Midterm midterm = new Midterm();

		Essay essay = new Essay();
	}
}

