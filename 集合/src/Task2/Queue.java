package Task2;
import java.util.*;
public class Queue {
	private LinkedList list;
	Queue(){
		list = new LinkedList();
	}
	public void enQueue(Object obj){
		list.addLast(obj);
	}
	public Object deQueue(){
		if(!list.isEmpty())  
	      {  
	          return list.removeFirst();  
	      }  
	      return null;
	}
	public int QueueLength(){  
		return list.size();  
	}  
	public void clear(){  
		list.clear();  
	}  
	public boolean QueueEmpty(){  
		return list.isEmpty();  
	}  
	public Object headElement(){
		return list.getFirst();
	}
}
