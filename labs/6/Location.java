
public class Location {
	public int row;
	public int col;
	public double maxVal;
	
	/** Method to locate the largest element in array and find coordinates of largest element */
	public static Location locateLargest(double[][] a) {
		Location myLocation = new Location();
		myLocation.row = 0;
		myLocation.col = 0;
		myLocation.maxVal = a[0][0];
		
		//search through array a to find largest element
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] > myLocation.maxVal) {
					myLocation.row = i;
					myLocation.col = j;
					myLocation.maxVal = a[i][j];
				}
			}
		}
		return myLocation;
	}
}
