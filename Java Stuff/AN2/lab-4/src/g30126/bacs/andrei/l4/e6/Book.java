package g30126.bacs.andrei.l4.e6;

import g30126.bacs.andrei.l4.e4.Author;

public class Book {
	private String name;
	private Author[] author;
	private double price;
	private int qtyInStock=0;
	public Book(String name,Author[] author, double price) {
		this.name=name;
		this.price=price;
		this.author=author;
	}
	public Book(String name,Author[] author,double price, int qtyInStock) {
		this.name=name;
		this.price=price;
		this.author=author;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public Author[] getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return name +"by"+ author.length+"authors";
	}
	public void printAuthors() {
	for(Author a:author)
	{
		System.out.println(a.getName());
	}

}}
