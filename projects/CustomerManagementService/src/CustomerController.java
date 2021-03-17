
public class CustomerController {
	
	public Customer createCustomer(Customer customer){
		System.out.println("Controller-create Method");
		CustomerService service = new CustomerService();
		service.createCustomer(customer);
		return null;
	}
	
	public Customer updateCustomer(Customer customer){
		System.out.println("Controller-update Method");
		CustomerService service = new CustomerService();
		service.updateCustomer(customer);
		return null;
	}
	
	public int deleteCustomer(int customerId){
		System.out.println("Controller-delete Method");
		CustomerService service = new CustomerService();
		service.deleteCustomer(customerId);
		return 0;
	}
	
	public Customer getCustomer(int customerId){
		System.out.println("Controller-get Method");
		CustomerService service = new CustomerService();
		service.getCustomer(customerId);
		return null;
	}
}
