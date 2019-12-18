package lettuce;

import java.time.Instant;

public class Response {
  public String ping() {
    Instant timestamp = Instant.now();
    return  timestamp + "lettuce - ping";
  }
}
