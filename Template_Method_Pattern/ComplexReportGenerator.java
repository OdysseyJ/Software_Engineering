package exercise02.templateMethod;

import java.util.ArrayList;
import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {

	@Override
	public String numOfCustomer(List<Customer> customers) {
		String report = String.format("고객의 수: %d 명입니다\n", customers.size());
		
		return report;
	}

	@Override
	public String customerList(List<Customer> customers) {
		String report = "";
		
		List<Customer> selected = new ArrayList<Customer>();
		
		for (Customer customer : customers)
			if (customer.getPoint() >= 100)
				selected.add(customer);
		
		for (int i = 0; i < selected.size(); i++) {
			Customer customer = selected.get(i);
			report += String.format("%d: %s\n", customer.getPoint(), customer.getName());
		}
		
		return report;
	}

	@Override
	public String endPoint(List<Customer> customers) {
		int totalPoint = 0;
		for (Customer customer : customers)
			totalPoint += customer.getPoint();
		
		String report = String.format("점수 합계: %d", totalPoint);
		
		return report;
	}

}
