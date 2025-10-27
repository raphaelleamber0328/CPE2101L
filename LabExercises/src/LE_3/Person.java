package LE_3;

import java.util.Scanner;

public class Person {
	
		private String name;
		private int age;

		// Constructor
		public Person(String name, int age)
		{
			this.name = name;
			this.age = age;
		}
		
		// accessors and mutators
		
		public String getName()
		{
			return name;
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public int getAge()
		{
			return age;
		}
		
		public void setAge(int age)
		{
			this.age = age;
		}
		
		// if names and age are equal
	    public boolean equals(Person otherPerson) 
	    {
	        if (otherPerson == null) return false;
	        return this.name.equals(otherPerson.getName()) && this.age == otherPerson.getAge();
	    }
	    
	    // compare young or old
	    public static void oldYoung(Person p1, Person p2)
	    {
	    	if (p1.getAge() > p2.getAge())
	    	{
	    		System.out.println(p1.getName() + " is older than " + p2.getName());
	    	}
	    	else if (p1.getAge() < p2.getAge())
	    	{
	    		System.out.println(p1.getName() + " is younger than " + p2.getName());
	    	}
	    	else 
	    	{
	    		System.out.println(p1.getName() + " and " + p2.getName() + " are the same age");
	    	}
	    }


		public static void main(String[] args) 
		{
	        
			Scanner keyboard = new Scanner(System.in);

	        System.out.print("Enter person 1 name: ");
	        String firstName = keyboard.nextLine();
	        System.out.print("Enter person 1 age: ");
	        int firstAge = keyboard.nextInt();
	        keyboard.nextLine();

	        System.out.print("\nEnter person 2 name: ");
	        String secondName = keyboard.nextLine();
	        System.out.print("Enter person 2 age: ");
	        int secondAge = keyboard.nextInt();
	        
	        Person one = new Person(firstName, firstAge);
	        Person two = new Person(secondName, secondAge);
	        
	 
	        System.out.println("\nAre the two persons equal? " + one.equals(two));
	        System.out.println("Do they have the same age? " + (one.getAge() == two.getAge()));
	        
	        oldYoung(one,two);
	        
	        
	        keyboard.close();
	    }
	}
