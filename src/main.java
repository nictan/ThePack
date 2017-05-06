
public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskObject k = new TaskObject();
		
		k.setPriority(1);
		k.setTaskName("HelloWorld");
		
		System.out.print(k.getPriority());
		System.out.println();
		System.out.print(k.getTaskName());
	}

}
