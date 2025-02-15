package _05_for_loops._2_badgers;

public class Badgers {
	public static void main(String[] args) {
		/*
		 * Badger, Badger, Badger, Badger, Badger, Badger, Badger,Badger, Badger,Badger, Badger, Badger
Mushroom, Mushroom
Badger, Badger, Badger,Badger, Badger, Badger, Badger,Badger, Badger, Badger, Badger, Badger
Mushroom, Mushroom
A Snake!!!
		 */
		
		for(int verse=0; verse<2; verse++) {
			for(int badgers=0; badgers<12; badgers++) {
				System.out.print("Badger, ");
			}
			System.out.println();
			for(int mushrooms=0; mushrooms<2; mushrooms++) {
				System.out.print("Mushrooms, ");
			}
			System.out.println();
		}
		System.out.println("A Snake ! ! ! ");
	}
}
