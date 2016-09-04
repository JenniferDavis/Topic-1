import java.util.*;

public class Ex1 {
	
		public static void main(String[] args) {
			
			/*Write a test program that creates two MyArrayLists, list1 and list2, with
			 * the initial values {"Tom", "George", "Peter", "Jean", "Jane"} and
			 * {"Tom", "George", "Michael", "Michelle", "Daniel"}
			 */
		
			// Create first list
			// MyList is the name of the interface, the class is list1?, MyArrayList is a method?
			//MyList<String> list1 = new MyArrayList<String>();
			ArrayList list1 = new ArrayList();
			
			// Add elements to the list
			list1.add("Tom"); 
			
			list1.add("George"); 
			
			list1.add("Peter"); 
			
			list1.add("Jean"); 
			
			list1.add("Jane"); 
			
			//Create second list
			// MyList is the name of the interface, the class is list2?, MyArrayList is a method?
			ArrayList list2 = new ArrayList();
						
			// Add elements to the list
			list2.add("Tom"); 
												
			list2.add("George"); 
												
			list2.add("Michael"); 
												
			list2.add("Michelle"); 
												
			list2.add("Daniel"); 
			
			//Invokes list1.addAll(list2), and displays list1 and list2
			list1.addAll(list2); 
			System.out.println("These are the lists after invoking addAll:\n" + "List 1: " + list1 + "\rList 2: " + list2 + "\n");
			
// I think I need to empty the list here before I repopulate it.  How? 
			list1.clear();
			list2.clear();
			
			/*Recreates list1 and list2 with the same initial values, 
			 * invokes list1.removeAll(list2), and displays list1 and list2.
			 */
			// Add elements to the list
			list1.add("Tom"); 
			
			list1.add("George"); 
			
			list1.add("Peter"); 
			
			list1.add("Jean"); 
			
			list1.add("Jane"); 
						
			list2.add("Tom"); 
			
			list2.add("George"); 
												
			list2.add("Michael"); 
												
			list2.add("Michelle"); 
												
			list2.add("Daniel"); 
			
			
			//Invokes list1.removeAll(list2), and displays list1 and list2
			list1.removeAll(list2); 
			System.out.println("These are the lists after invoking removeAll:\n" + "List 1: " + list1 + "\rList 2: " + list2 + "\n");
			
			
			
// I think I need to empty the list here before I repopulate it.  How? 
			list1.clear();
			list2.clear();
			
			
			/*Recreates list1 and list2 with the same initial values, 
			 * invokes list1.retainAll(list2), and displays list1 and list2.
			 */
			
			// Add elements to the list
			list1.add("Tom"); 
			
			list1.add("George"); 
			
			list1.add("Peter"); 
			
			list1.add("Jean"); 
			
			list1.add("Jane"); 
									
			list2.add("Tom"); 
			
			list2.add("George"); 
												
			list2.add("Michael"); 
												
			list2.add("Michelle"); 
												
			list2.add("Daniel"); 
						
						
			//Invokes list1.removeAll(list2), and displays list1 and list2
			list1.retainAll(list2); 
			System.out.println("These are the lists after invoking retainAll:\n" + "List 1: " + list1 + "\rList 2: " + list2);
			

			}
		

	// MyList is the interface where methods are defined.
	public interface MyList<E> extends java.lang.Iterable<E> {
				
				// Add methods from exercise 24.1
				
				// Add the elements in otherList to this list.
				//Returns true if this list changed as a result of the call.
				public boolean addAll(MyList<E> otherList);
				
				// Removes all the elements in otherList from this list.
				//Returns true if this list changed as a result of the call.
				public boolean removeAll(MyList<E> otherList);
							
				// Returns the elements in this list that are also in the otherList.
				//Returns true if this list changed as a result of the call.
				public boolean retainAll(MyList<E> otherList);
				
				//Clear the list 
				public void clear();
				
				// Return true if this list doesn't contain any elements 
				public boolean isEmpty();
				

				
			}
			
	// abstract class defined and implemented with MyList interface
	public abstract class MyAbstractList<E> implements MyList<E> {
				protected int size = 0; // The size of the list
				
				/** Create a default list */
				protected MyAbstractList() {
				}
				
				/** Create a list from an array of objects */
				protected MyAbstractList(E[] objects) {
				}
				 
				@Override /** Return true if this list doesn't contain any elements */
				public boolean isEmpty() {
				return size == 0;
				}	
			}
}

