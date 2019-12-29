package lettuce;

import java.time.Instant;

public class Todo {
//	private final long id;
//	private final String;
	
	public String ping() {
		Instant timestamp = Instant.now();
		return timestamp + "lettuce - ping";
	}
}
