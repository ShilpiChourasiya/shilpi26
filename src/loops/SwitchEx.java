package loops;

public class SwitchEx {
	public static void main (String... args)
	{
		String shapes ="32";

		switch (shapes){
		case "circle":
			System.out.println("Executing circle");
			break;
		case "Triangle":
			System.out.println("Executing triangle");
			break;
		default:
			System.out.println("Executing pantagn");
			break;
		case "Rectangle":
			System.out.println("Executing rectangle");
			break;
		case "32":
			System.out.println("Executing int");
			break;

		}
	}

}
