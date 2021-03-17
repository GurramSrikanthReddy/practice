
public class ProductController {
	
	public Product createProduct(Product product){
		System.out.println("Controller-create Method");
		ProductService service = new ProductService();
		service.createProduct(product);
		return null;
	}
	
	public Product updateProduct(Product product){
		System.out.println("Controller-update Method");
		ProductService service = new ProductService();
		service.updateProduct(product);
		return null;
	}
	
	public int deleteProduct(int productId){
		System.out.println("Controller-delete Method");
		ProductService service = new ProductService();
		service.deleteProduct(productId);
		return 0;
	}
	
	public Product getProduct(int productId){
		System.out.println("Controller-get Method");
		ProductService service = new ProductService();
		service.getProduct(productId);
		return null;
	}
}
