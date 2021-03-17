
public class ProductService {
	
	public Product createProduct(Product product){
		System.out.println("Service-create Method");
		ProductDAO dao = new ProductDAO();
		dao.createProduct(product);
		return null;
	}
	
	public Product updateProduct(Product product){
		System.out.println("Service-update Method");
		ProductDAO dao = new ProductDAO();
		dao.updateProduct(product);
		return null;
	}
	
	public int deleteProduct(int productId){
		System.out.println("Service-delete Method");
		ProductDAO dao = new ProductDAO();
		dao.deleteProduct(productId);
		return 0;
	}
	
	public Product getProduct(int productId){
		System.out.println("Service-get Method");
		ProductDAO dao = new ProductDAO();
		dao.getProduct(productId);
		return null;
	}

}
