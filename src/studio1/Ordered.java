package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
boolean xy = (x < y);
boolean yz = (y < z);
boolean yx = (x > y);
boolean zy = (y > z);
boolean inOrder = xy && yz || yx && zy;
System.out.println(inOrder);
	}

}
