package com.gurukul.day5;

abstract class Shape{
	
	double x,y;
	Shape(){
		
	}
	Shape(double x,double y){
		this.x=x;
		this.y=y;
	}
	void set(double x,double y){
		this.x=x;
		this.y=y;
	}
	abstract double area();
	public String toString() {
		return x+" "+ y;
	}
}
class Rect extends Shape
{
	Rect(double x,double y){
		super(x,y);
	}
	double area() {
		return x*y;
	}
	
}

class  Tri extends Shape{
	double area() {
		return x*y/2;
	}
}

public class abstClass {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Shape a;//cannot create object of abstract class only refrence of shape created
//		//Shape s= new Shape(); not allowed.
//		Rect r= new Rect(6,5);
//		r.set(7, 9);
//		double ar=r.area();
//		System.out.println("area :"+ar);
//		
//		Triangle t= new Triangle();
//		t.set(4, 20);
//		ar=t.area();
//		System.out.println("Area :"+ ar);
//		
//		a=t;
//		a.set(20, 30);
//		ar=a.area();
//		System.out.println("area"+ar);//300
//		
//		a=r;
//		a.set(6, 60);
//		ar=a.area();
//		System.out.println("area :"+ar);//360
//		
//		ar=r.area();
//		System.out.println("area :"+ar);//300
//	}
public static void main(String[] args) {
		
		Shape a;//=new Shape();
		//a.set(2, 3);
	   // double ar=a.area();
	   // System.out.println("area"+ar);
		Rect r=new Rect(4,5);
		r.set(6,7);
		double ar=r.area();
		System.out.println("area"+ar);//42
		
		Tri t=new Tri();
		t.set(16,17);
		ar=t.area();
		System.out.println("area"+ar);//136
		// TODO Auto-generated method stub
		
		a=t;
		a.set(20,30);
		ar=a.area();
		System.out.println("area"+ar);//300
		a=r;
		a.set(6,60);
		ar=a.area();
		System.out.println("area"+ar);//360
		ar=r.area();
		System.out.println("area"+ar);//360


	}



}
