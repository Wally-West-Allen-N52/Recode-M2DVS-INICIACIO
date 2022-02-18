package javaVariavel;

public class OperadoresLogicos06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 6;
		
		System.out.println(a == b && b == a); // false
		System.out.println(a != b || a < b); // true
		System.out.println(a > b && a == b); // false
		System.out.println(a >= b || b <= a); // false
	}
}
