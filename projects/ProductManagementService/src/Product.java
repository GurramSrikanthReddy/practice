
public class Product {
	
	String	productId;
	String productDescription;
	double productPrice;
	int productDiscountPercentage;
	double productDiscoutnPrice; 

	public Product(String productId,String productDescription,double productPrice,int productDiscountPercentage,double productDiscoutnPrice){
		
		this.productId = productId;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productDiscountPercentage = productDiscountPercentage;
		this.productDiscoutnPrice = productDiscoutnPrice;
	}

}
