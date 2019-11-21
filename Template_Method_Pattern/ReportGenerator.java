package exercise02.templateMethod;
import java.util.ArrayList;
import java.util.List;

public abstract class ReportGenerator {
	public final String templateMethod(List<Customer> customers) {
		String head = numOfCustomer(customers);
		String body = customerList(customers);
		String tail = endPoint(customers);
		String report = head + body + tail;
		return report;
	}
	
	public abstract String numOfCustomer(List<Customer> customers);
	public abstract String customerList(List<Customer> customers);
	public abstract String endPoint(List<Customer> customers);
}
