package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Car {

	int lyear,price;
	String name,brandname;

	public int getLyear() {
		return lyear;
	}

	public void setLyear(int lyear) {
		this.lyear = lyear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String toString() {
		return "Car [lyear=" + lyear + ", price=" + price + ", name=" + name + ", brandname=" + brandname + "]";
	}

}
