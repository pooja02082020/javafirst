package typecastingandcontrolstatements;

public class WideningExample {
	public static void main(String[] args) {
		int requestCount = 1200;
		long totalRequests = requestCount; // Implicit widening
		double avgResponse = totalRequests; // long → double
		System.out.println("Total Requests: " + totalRequests);
		System.out.println("Average Response Time: " + avgResponse);
	}
}