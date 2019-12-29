package lettuce;

public class Application {
	public static void main(final String[] args) {
		final Todo todo = new Todo();
		System.out.println(todo.ping());
	}
}