package veeraj;


enum Session
{
	MORNING, AFTERNOON , EVENING , NIGHT
}
public class pgm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session sessions[] = Session.values();
		System.out.println("All Enum Constants:");
		for(Session se : sessions) {
			System.out.println(se);
		}
		String sessionName ="MORNING";
		Session se = Session.valueOf(sessionName);
		System.out.println("\nEnum Constant for Name '"+sessionName+ "': "+se);
		
		int ordinal=se.ordinal();
		System.out.println("\nPosition of Enum Constant "+ se +": "+ordinal);
	}

}
