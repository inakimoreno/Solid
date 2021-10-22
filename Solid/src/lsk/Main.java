package lsk;

public class Main {

	public static void main(String[] args) {
		Project p1 = new Project();
		Project p2 = new Project();
		Project p3 = new Project();
		
		p1.addProject(new ProjectFile("pf1"));
		p2.addProject(new ProjectFile("pf2"));
		p3.addProject(new ReadOnlyProjectFile("ropf1"));
	}
	
}
