
public class CustomerService {
	
	public Customer createCustomer(Customer customer){
		System.out.println("Service-create Method");
		CustomerDAO dao = new CustomerDAO();
		dao.createCustomer(customer);
		return null;
	}
	
	public Customer updateCustomer(Customer customer){
		System.out.println("Service-update Method");
		CustomerDAO dao = new CustomerDAO();
		dao.updateCustomer(customer);
		return null;
	}
	
	public int deleteCustomer(int customerId){
		System.out.println("Service-delete Method");
		CustomerDAO dao = new CustomerDAO();
		dao.deleteCustomer(customerId );
		return 0;
	}
	
	public Customer getCustomer(int customerId){
		System.out.println("Service-get Method");
		CustomerDAO dao = new CustomerDAO();
		dao.getCustomer(customerId);
		return null;
	}

}
