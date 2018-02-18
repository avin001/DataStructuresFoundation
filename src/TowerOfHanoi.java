
public class TowerOfHanoi {
	
	public static void printTowerOfHanoiSteps(int disks, char src, char aux, char dest) {
		if (disks == 0)
			return;
		if (disks == 1)
			System.out.println(Character.toString(src) + " " + Character.toString(dest));
		if (disks > 1) {
			printTowerOfHanoiSteps(disks - 1, src, dest, aux);
			System.out.println(Character.toString(src) + " " + Character.toString(dest));
			printTowerOfHanoiSteps(disks - 1, aux, src, dest);
		}
		
	}

	public static void main(String[] args) {
		/*
		 
		 Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle 
		 is to move all disks from source rod to destination rod using third rod (say auxiliary). The rules are : 
		 
		 1) Only one disk can be moved at a time. 
		 2) A disk can be moved only if it is on the top of a rod. 
		 3) No disk can be placed on the top of a smaller disk. 
		 
		 Print the steps required to move n disks from source rod to destination rod. 
		 
		 Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'. 
		 
		 Input Format : 
		 Integer n 
		 
		 Output Format : 
		 Steps in different lines (in one line print source and destination rod name separated by space) 
		 */
		
		char src = 'a';
		char aux = 'b';
		char dest = 'c';
		int n = 2;
		printTowerOfHanoiSteps(n, src, aux, dest);
	}

}
