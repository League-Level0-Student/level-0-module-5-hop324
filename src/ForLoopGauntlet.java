
public class ForLoopGauntlet {
public static void main(String [] Args) {
	for(int i = 0; i < 100; i++) {
		System.out.println(i);
	}
	for(int x = 100; x > 0; x--) {
		System.out.println(x);
	}
	for(int i = 0; i < 100; i++) {
		if(i%2 == 0) {
			System.out.println(i);
		}
	}
	for(int z = 0; z < 100; z++) {
		if(z%2 == 1) {
			System.out.println(z);
		}
	}
	for(int i = 1; i < 501; i++) {
		if(i%2 == 0) {
			System.out.println(i + " is even");
		}
		else {
			System.out.println(i + " is odd");
		}
	}
	for(int i = 0; i < 780; i++) {
		if(i%7 == 0) {
			System.out.println(i);
		}
	}
	for(int i = 0; i < 14; i++) {
		int year = 2004+i;
		System.out.println("In");
	}
}
}
