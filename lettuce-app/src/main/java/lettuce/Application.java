package lettuce;

public class Application {
  public static void main(final String[] args) {
    final Response resp = new Response();
    System.out.println(resp.ping());
  }
}