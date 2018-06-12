package The16Task2;
import java.util.*;
//Queue队列
public class Queue {
	private LinkedList list;
	Queue(){
		list = new LinkedList();
	}
	//进入队列
	public void enQueue(Object obj){
		list.addLast(obj);
	}
	//出队列
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
