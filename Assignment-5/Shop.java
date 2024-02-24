class Product{
	private int price;
	private int id;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "price=" + price + ", id=" + id;
	}
	
}

class Electronics extends Product{
	private int wattage;
	private int warranty;
	public int getWattage() {
		return wattage;
	}
	public void setWattage(int wattage) {
		this.wattage = wattage;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	@Override
	public String toString() {
		return "Electronics [wattage=" + wattage + ", warranty=" + warranty + ", " + super.toString() + "]";
	}
	
	
}

class Clothing extends Product{
	private String material;
	private String brand;
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Clothing [material=" + material + ", brand=" + brand + ", "+ super.toString() + "]";
	}
	
}

class Books extends Product{
	private int pages;
	private String author;
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Books [pages=" + pages + ", author=" + author + ", " + super.toString() + "]";
	}
	
}
public class Shop {
    public static void main(String[] args) {

        Electronics electronicsProduct = new Electronics();
        electronicsProduct.setId(100);
        electronicsProduct.setPrice(50000);
        electronicsProduct.setWattage(30);
        electronicsProduct.setWarranty(1);

        Clothing clothingProduct = new Clothing();
        clothingProduct.setId(200);
        clothingProduct.setPrice(1000);
        clothingProduct.setMaterial("Cotton");
        clothingProduct.setBrand("Adidas");

        Books booksProduct = new Books();
        booksProduct.setId(300);
        booksProduct.setPrice(349);
        booksProduct.setPages(500);
        booksProduct.setAuthor("Suzane Bond");

        System.out.println("Electronics Product:");
        System.out.println(electronicsProduct);

        System.out.println("\nClothing Product:");
        System.out.println(clothingProduct);

        System.out.println("\nBooks Product:");
        System.out.println(booksProduct);
    }
}
