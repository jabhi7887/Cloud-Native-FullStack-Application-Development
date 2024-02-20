This project is a simple implementation of a ticket booking system using Java and Spring Framework.

Search for Spring Initilizer https://start.spring.io/ in browser and make project as maven and then select language as java and Generate
After Generating go to download folder and extract the folder where ever u want 
Go to eclipse, in eclipse go to file then import , select maven and in maven select existing maven project

Overview
The project consists of the following components:

Customer: Represents a customer with name, address, and associated ticket.
Ticket: Represents a ticket with ticket number, price, seat number, and ticket type.
Setup
Clone the repository to your local machine.
Ensure you have Java Development Kit (JDK) installed.
Import the project into your preferred Java IDE.
Run the DemoApplication class to start the application.
Usage
Upon running the application, you'll be prompted with a menu offering the following options:

Insert the details: Allows you to input customer and ticket details.
Display details: Displays the details of the customer and associated ticket.
Exit: Quits the application.
Follow the on-screen instructions to navigate through the menu and interact with the system.

Configuration
The project utilizes Spring Framework for dependency injection and bean management. Configuration is done via XML file testBean.xml, located in the resources directory.

Customer.java 
package com.example.Program1;

public class Customer {
	String name, address;
	Ticket tick;
	public Ticket getTick() {
	return tick;
	}
	public void setTick(Ticket tick) {
	this.tick = tick;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
	this.address = address;
	}
}

Ticket.java
package com.example.Program1;

public class Ticket {
	int ticno,price,seatno;
	String ticktype;
	public int getTicno() {
	return ticno;
	}
	public void setTicno(int ticno) {
	this.ticno = ticno;
	}
	public int getPrice() {
	return price;
	}
	public void setPrice(int price) {
	this.price = price;
	}
	public int getSeatno() {
	return seatno;
	}
	public void setSeatno(int seatno) {
	this.seatno = seatno;
	}
	public String getTicktype() {
	return ticktype;
	}
	public void setTicktype(String ticktype) {
	this.ticktype = ticktype;
	}
}

Program1Application.java(main program)
package com.example.Program1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Program1Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		SpringApplication.run(Program1Application.class, args); 
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("testBean.xml"); Customer c = (Customer) ac.getBean("customer"); 
		Ticket t = (Ticket) c.getTick(); 
		while(true) { 
		System.out.println("1. insert the details\n 2. Display details \n" + "3. exit"); 
		System.out.println("enter the choice"); 
		int a = sc.nextInt(); 
		switch(a) { 
		 case 1:  
		System.out.println("enter the customer name"); 
		c.setName(sc.next()); 
		System.out.println("enter the customer address"); 
		c.setAddress(sc.next()); 
		System.out.println("enter the ticket number"); 
		t.setTicno(sc.nextInt()); 
		System.out.println("enter the ticket seat no"); 
		t.setSeatno(sc.nextInt()); 
		System.out.println("enter the ticket price"); 
		t.setPrice(sc.nextInt()); 
		System.out.println("enter the ticket Type -  economic/gold/platinum"); 
		t.setTicktype(sc.next()); 
		c.setTick(t); 
		System.out.println("thanks for input");  
		break; 
		 case 2:  
		System.out.println("Customer Details:"); 
		System.out.println("Name:"+c.getName()+" "+" Address:"+c.getAddress()); 
		System.out.println("Ticket Details"); 
		t = c.getTick(); 
		System.out.println("Ticket No: "+t.getTicno()); 
		System.out.println("Ticket Type: "+t.getTicktype()); 
		 System.out.println("Ticket Seat No: "+t.getSeatno()); System.out.println("Ticket Price: "+t.getPrice()); 
		break; 
		case 3:  
		System.exit(0);  
		 }  
		}  

	}

}


testbeam.xml
<?xml version="1.0" encoding="UTF-8"?> 
<beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://www.springframework.org/schema/beans https://www.springframework.org/schema/beans/spring-beans.xsd"> 
<bean id="customer" 
class="com.example.Program1.Customer" 
scope="prototype"> 
 <property name="tick" ref="ticket"></property> 
</bean> 
<bean id="ticket" class="com.example.Program1.Ticket" scope="prototype"/> </beans>





Contributing
Contributions are welcome! Feel free to fork the repository and submit pull requests for any improvements or bug fixes.
