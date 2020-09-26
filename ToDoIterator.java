package iteratordesignpattern;
import java.util.Iterator;


public class ToDoIterator {
	private ToDo[] todos;
	private int position;
	/*
	 * if statement of todos
	 */
	public boolean next()
	{
		this.todos = todos;
		if(todos != null)
		{
			this.todos = todos;	
			return true;
		}
		else {
			return (Boolean) null;
		}
	}
	/*
	 * has next
	 */
	public boolean hasNext()
	{
		return false;
	}
	/*
	 * the to do
	 */
	public ToDoIterator(ToDo[] todos)
	{
		
	}
	

}
