import java.util.ArrayList;

public class Problem13_3 {

	public static void main(String[] args) {
		//create an ArrayList
		ArrayList<Number> list = new ArrayList<>();
		
		//add numbers to list to test
		list.add(10.2);
		list.add(1.123);
		list.add(7.23);
		list.add(6);
		list.add(25.1);
		list.add(2.2222);
		list.add(15.78);
		
		//print out list before sort
		System.out.println(list);
		
		//call sort method and print out sorted list
		sort(list);
		System.out.println(list);
	}
	
	/**method sorts an ArrayList of numbers*/
	public static void sort(ArrayList<Number> list) {
		for(int i = 0; i < list.size() - 1; i++) {
			//set first element equal to min to start
			Number min = list.get(i);
			int indexOfMin = i;
			
			for (int j = i + 1; j < list.size(); j++) {
				//see if element is less than current min and if so swap
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					indexOfMin = j;
					list.set(indexOfMin, list.get(i));
					list.set(i, min);
				}
			}

			
		}
	}

}
