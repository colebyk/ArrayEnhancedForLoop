import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		int bucky[] = {3,4,5,6,7};
		int total = 0;
		
		for(int x: bucky) {
			total+=x;
		}

		System.out.println(total);
		
		
		
		List<String> listOfStrings = new ArrayList<String>();
		
		listOfStrings.add("AAA");
		listOfStrings.add("BBB");
		listOfStrings.add("CCC");
		listOfStrings.add("DDD");
		listOfStrings.add("EEE");
		listOfStrings.add("FFF");
		listOfStrings.add("GGG");
		listOfStrings.add("HHH");
		
		System.out.println("\nList items: ");
		for (int i = 0; i < listOfStrings.size(); i++) {
			System.out.println(listOfStrings.get(i));
		}
		
		System.out.println("\n" + listOfStrings.remove(0));
		
		
		System.out.println("\nList items: ");
		for (int i = 0; i < listOfStrings.size(); i++) {
			System.out.println(listOfStrings.get(i));
		}
		
		System.out.println("\nList items: ");
		
		for (String x: listOfStrings) {
			System.out.println(x);
			
		}
		
		
		// 2d arrays
		System.out.println("\n2d array\n");
		
		int a=5, b=6, c=7, d=8;
		int x[] = {5,6,7,8};
		int y[] = {6,7,8,9};
		int z[] = {9,8,7,6};
		
		int p[][] = {
				{5,6,7,8},
				{6,7,8,9},
				{9,8,7,6}
					};
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(p[i][j] + "");
			}
			System.out.println("");
		}
		
		for (int[] i: p) {
			for (int j: i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}


