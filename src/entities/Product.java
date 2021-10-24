package entities;

public class Product {
	public String name;
	public Double price;
	
	public Product() {
	
	}
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public String priceTag() {
		return name + " R$ "
		+ String.format("%.2f", price);		
	}

}
