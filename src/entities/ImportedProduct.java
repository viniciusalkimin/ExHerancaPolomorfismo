package entities;

public class ImportedProduct extends Product{
	public Double customsFee;

	public ImportedProduct() {
		super();
	}
	public ImportedProduct(String name,Double price, Double customFee) {
		super(name, price);
		this.customsFee = customFee;
	}
	public Double getCustomFee() {
		return customsFee;
	}
	public void setCustomFee(Double customsFee) {
		this.customsFee = customsFee;
	}	
	@Override
	public String priceTag() {
		return name + " R$ "
		+ String.format("%.2f", totalPrice());		
	}
	public Double totalPrice() {
		return getPrice() + customsFee;
	}	
}





















