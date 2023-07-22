package com.gurukul.day5;

class Publication
{
	String title;
	double price;
	Publication(){}
	Publication(String t,double p)
	{
		title=t;
		price=p;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString()
	{
		return "Title :"+title+"  Price :"+price ; 
	}
	
}

class Book extends Publication
{
	int No_page;
	Book(){}
	Book(String t,double p,int n)
	{
		super(t,p);
		No_page =n;
	}
	public String toString()
	{
		return super.toString()+" No of Pages :"+ No_page;
	}
}

class Movie extends Publication
{
	String Director, Lead_actor;
	Movie(){}
	Movie(String t,double p,String d,String l)
	{
		super(t,p);
		Director = d;
		Lead_actor=l;
	}
	public String toString()
	{
		return super.toString()+"  Director :"+ Director+"  Leading Actor : "+Lead_actor;
	}
}

public class BookMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b= new Book("3 idiots",250,300);
		Movie m= new Movie("Jai Ho ",500,"Sanjay","Ranbir");
	
		if(b.getPrice()>m.getPrice())
			System.out.println(b);
		else 
			System.out.println(m);
			
	}

}
