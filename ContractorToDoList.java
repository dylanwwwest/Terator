package iteratordesignpattern;

import java.util.ArrayList;
/*
 * sets variables
 */
public class ContractorToDoList {
	private String address;
	private ToDo[] todos;
	private int count;
	private String title;
	private String description;
	private double price;
	/*
	 * makes variables turn into the current variables
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies)
	{
		this.title = title;
		this.description = description;
		this.price = price;
	}
	/*
	 * makes new ToDoIterator
	 */
	public ToDoIterator createIterator()
	{
		return new ToDoIterator(todos);
	}
	/*
	 * gets this address
	 */
	public String getAddress()
	{
		this.address = address;
		return address;
		
	}
	/*
	 * returns total cost
	 */
	public double getTotalCost()
	{
		return count;
	}
	/*
	 * grows the array
	 */
	private ToDo[] growArray(ToDo[] todos)
	{
		this.todos = todos;
		return todos;
		
	}
}
