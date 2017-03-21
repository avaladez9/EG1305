import java.util.Scanner;
public class TestPet {
	public static void main(String[] args)
	{
		Pet a1 = new Pet(); // new pet object called animal
		Scanner in = new Scanner(System.in);
		String name, type;
		int age;
		System.out.println("Enter the animals name: ");
		name = in.nextLine();
	
		System.out.println("Enter the type of animal: ");
		type = in.nextLine();
		
		System.out.println("Enter the animals age: ");
		age = in.nextInt();
		
		a1.setName(name);
		a1.setType(type);
		a1.setAge(age);
		
		System.out.println("Pet object created");
		System.out.print("Your pet's name is " + a1.getName() + "\n");
		System.out.print("Your pet's type is " + a1.getType() + "\n");
		System.out.print("Your pet's age is " + a1.getAge() + "\n");
		
	}
}
