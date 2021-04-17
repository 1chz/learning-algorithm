package baekjoon;

public class Dog {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.printDog();
		/*
		|\_/|
		|q p|   /}
		( 0 )"""\
		|"^"`    |
		||_/=\\__|
		 */
	}
	
	public void printDog() {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}

}
