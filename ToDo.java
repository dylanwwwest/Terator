package iteratordesignpattern;

import java.util.ArrayList;

public class ToDo {
	/*
	 * sets the variables
	 */
private String title;
private String description;
private double price;
private String contact;
private ArrayList<String> supplies;

/*
 * Returns the price
 */
public double getPrice()
{
	return price;
	
}
/*
 * Prints the toString
 */
public String toString()
	{
	 System.out.println("***" + title + "***\n");
	 System.out.println(description);
	 System.out.println("business contact: " + contact);
	 System.out.println("Supply List" + supplies);
	return contact;
	 
	}

}
