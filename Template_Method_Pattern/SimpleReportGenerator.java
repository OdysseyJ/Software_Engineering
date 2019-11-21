package exercise02.templateMethod;

import java.util.ArrayList;
import java.util.List;

public class SimpleReportGenerator extends ReportGenerator{

	@Override
	public String numOfCustomer(List<Customer> customers) {
		String report = String.format("고객의 수: %d 명\n", customers.size());
		
		return report;
	}

	@Override
	public String customerList(List<Customer> customers) {
		String report = "";
		
		for (int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);
			report += String.format("%s: %d\n", customer.getName(), customer.getPoint());
		}
		
		return report;
	}

	@Override
	public String endPoint(List<Customer> customers) {
		String report = "";
		
		return report;
	}

}
