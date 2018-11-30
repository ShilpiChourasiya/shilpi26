package loops;

public class SwitchCaseExample {
	public static void main (String... args){
		String place="lucknow";
		String city="amrtisar";
		String destination = null;
		
		switch(place){
		case "lucknow":
			System.out.println("User Want to go lucknow " +place);
			break;
		case "Delhi":
			System.out.println("User Want to go delhi");
			break;
		case "hydrabad":
			System.out.println("User Want to go hydrabad");
			break;
		case "amrtisar":
			System.out.println("User Want to go amrisar");
			break;
		}
	}
	
	
}


