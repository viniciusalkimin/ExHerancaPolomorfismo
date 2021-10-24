package entities;

import java.util.Date;

public class UsedProduct extends Product{
	public Date manufactureDate;
	
	public UsedProduct () {
		super();
	}
	
	public UsedProduct(String name,Double price, Date manufactureDate) {
		super(name,price);
		this.manufactureDate=manufactureDate;		
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return name + " R$ "
		+ String.format("%.2f", price);		
	}
}
