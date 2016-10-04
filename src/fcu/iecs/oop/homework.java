package fcu.iecs.oop;

public class homework {

	public static void main(String[] args) {
		
		String lyrics = "Let it go! Let it go! Cannot hold it back anymore";
		String replaced = lyrics.replace("it", "\"her\"");
		String chanced = replaced.replace("Cannot", "Can\'t");
		System.out.println(chanced);
		
	}
}
