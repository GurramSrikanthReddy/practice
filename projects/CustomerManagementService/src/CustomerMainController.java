
public class CustomerMainController {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		customer.setCustomerId(123);
		customer.setFirstName("Srikanth");
		customer.setMiddleName("Reddy");
		customer.setLastName("Gurram");
		customer.setPrefix("ABCD");
		customer.setPhone(989898989898L);
		customer.setAdhar(123456789121L);
		customer.setPan("ABCD124SD");
		customer.setAddress("Hyderabad");

		CustomerController customerController = new CustomerController();
		
		customerController.createCustomer(customer);
		customerController.updateCustomer(customer);
		customerController.deleteCustomer(123);
		customerController.getCustomer(123);
		
	}

}
