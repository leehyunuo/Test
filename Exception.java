package w6;

import java.util.Arrays;

public class Exception {

	static int[] a;
	
	public static void main(String[] args) {
		
		int error_code;
		
		error_code= makeArrayAndTest(1, 4);	// 1번 방에 4를 저장.
		if (error_code == 0)
			System.out.println(Arrays.toString(a));
		else
			System.out.println("Error! error code = " + error_code);

		error_code = makeArrayAndTest(10, 4);	// 10번 방에 4를 저장.
		if (error_code == 0)
			System.out.println(Arrays.toString(a));
		else
			System.out.println("Error! error code = " + error_code);
		
	}

	static int makeArrayAndTest(int index, int value) {
		a = new int[10];
		return(test(index, value));
	}

	static int test(int index, int value) {
		return set(index, value);	
	}

	static int set(int index, int value) {
		if (index < 0 || index >= a.length) {
			return -1;	// 인덱스가 범위를 벗어암.
		}
		else {
			a[index] = value;
			return 0;
		}
	}
}

