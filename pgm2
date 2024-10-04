package veeraj;
/*create a class book which contains four members: name,author,price,num of pages.Include a constructor to set the values for the members.
 *  Include methods to set and get the details of the object.Include a toString() method that could display the complete the details of the book.
 *  Develop a java program to create n book objects
 */
class Book1
{
	private String name;
	private String author;
	private double price;
	private int numOfPages;
	public String getName() {
	return name; }
	public void setName(String name) {
	this.name = name; }
	public String getAuthor() {
	return author; }
	public void setAuthor(String author) {
	this.author = author; }
	public double getPrice() {
	return price; }
	public void setPrice(double price) {
	this.price = price; }
	public int getNumOfPages() {
	return numOfPages; }
	public void setNumOfPages(int numOfPages) {
	this.numOfPages = numOfPages; }
	public String toString()
{
return "Book Details \n" +
"Name: " + name + "\n" +
"Author: " + author + "\n" +
"Price: $" 	+ price + "\n" +
"Number of Pages: " + numOfPages;
}
}
public class pgm2 {
public static void main(String[] args) {
	int n = 2;
	Book1[] books = new Book1[n];
	books[0] = new Book1();
	books[0].setName("Java Programming");
	books[0].setAuthor("John Doe");
	books[0].setPrice(29.99);
	books[0].setNumOfPages(400);
	books[1] = new Book1();
	books[1].setName("Data Structures and Algorithms");
	books[1].setAuthor("Jane Smith");
	books[1].setPrice(39.95);
	books[1].setNumOfPages(550);
	System.out.println("Book Details using getter methods");
	for (int i = 0; i < n; i++)
	{
	System.out.println("Book " + (i+1));
	System.out.println(books[i].getName());
	System.out.println(books[i].getAuthor());
	System.out.println(books[i].getPrice());
	System.out.println(books[i].getNumOfPages());
	}
		System.out.println("\nBook Details using toString()");
		for (int i = 0; i < n; i++)
		{
			System.out.println(books[i].toString());
		}
	}
}
