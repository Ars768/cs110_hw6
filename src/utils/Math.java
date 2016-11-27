package utils;

public class Math {
	public static int factorial(int a){
		if (a <= 1){return 1;}
		return a * factorial(a-1);
	}
	
	public static int factorialLoop(int a){
		int s = 1;
		for (int i = a; i >= 1; i--)
		{
			s = s * i;
		}
		return s;
	}
}
