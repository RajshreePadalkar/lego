package com.gurukul.day5;

class Person{
	private String name;
	private int age;
	
	Person(){}
	Person(String n,int a)
	{
		name=n;
		age=a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{
		return "Name :"+name+" Age :"+age;
	}
}
class Employee extends Person
{
	private int e_id;
	private double salary;
	Employee(){}
	Employee(String n,int a,int id,double sal)
	{
		super(n,a);
		e_id=id;
		salary = sal;
	}
	public String toString()
	{
		return super.toString()+" Employee Id :"+ e_id+" Salary :"+ salary;
	}
	
}
class Student extends Person
{
	private int rollno;
	Student(){}
	Student(String n,int a,int r)
	{
		super(n,a);
		rollno=r;
	}
	public String toString()
	{
		return super.toString()+" Roll No. :"+ rollno;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person x=new Person("Ravi", 20);
		//x.print();
		System.out.println(x);
		Employee y=new Employee("Ram", 20,101,20000);
		//y.set("Ram", 20,10,200000);
		//y.set(101, 20000);
		//y.print();
		System.out.println(y);
		
		Student z=new Student("Zaiba", 30,120);
		
		System.out.println(z);
		if(z.getAge()>y.getAge()) 
			System.out.print(z.getName()+" is elder");
		else
				System.out.println(y.getName()+ "is elder");
		
	}

}
