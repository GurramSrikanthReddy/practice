
public class ProductMainController {

	public static void main(String[] args) {

		Product product = new Product("123","Redmi",10000.00,10,9000.00);
		
		System.out.println(product.productId);
		System.out.println(product.productDescription);
		System.out.println(product.productPrice);
		System.out.println(product.productDiscountPercentage);
		System.out.println(product.productDiscoutnPrice);

		ProductController productController = new ProductController();
		
		productController.createProduct(product);
		productController.updateProduct(product);
		productController.deleteProduct(123);
		productController.getProduct(123);
		
	}

}
