package com.claim;

public class Application {
	
	public static void main(String[] args){
		Person person1 = new Person();
		Address address1 = new Address();
		Address address2 = new Address("909 Hope Place", "Columbia", "MO", 65203);
		Person person2 = new Person("Joelle", "Fronzaglio", "27", "5732015332", 4.0, address2);
		person1.setLastName("Garrison");
		person1.setFirstName("Shonda");
		person1.setAge("47");
		//for telephone, take as a string, use .equals to compare strings.
		person1.setTelephone("8167193060");
		person1.setAddress(" ", " ", " ", 5);
		person1.setGpa(4.1);
		address1.setCity("Kansas City");
		address1.setState("MO");
		address1.setZipcode(64111);
		
		System.out.println(person2.getFirstName() + " " + person2.getLastName() + " " + address2.getCity()+ " " + address2.getState()+ " " + address2.getZipcode());

		System.out.println(person1.getFirstName() + " " + person1.getLastName() + " " + address1.getCity()+ " " + address1.getState()+ " " + address1.getZipcode());
		
	}
	
	
}
