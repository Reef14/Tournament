package pl.com.iwach.tournament;

public class Main {


	public static void main(String[] args) {
		
		League Abc = new League(7);
		System.out.println("Do rozegrania jest "+ Abc.matchesToPlay() +" meczów.");
		Abc.generateSchedule();
		
//		Teams1 = new int[(int)Math.ceil(teamNumber/2)];		
//		Teams2 = new int[(int)Math.ceil(teamNumber/2)];	
//		
//		System.out.println((int)Math.ceil(teamNumber/2));
	
//		int i = 9;
//		int x = (int) Math.ceil((float) i/2);
//		System.out.println(x);


}
}
