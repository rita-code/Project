package exception;

public class VotingException {

	public static void main(String[] args) throws AgeException {
		VotingException obj=new VotingException();
		obj.display(15);
	}
	public void display(int age) throws AgeException
	{
		
				if(age<18) {
					throw new AgeException(" Not elligible");
				}
				else {
					System.out.println(" Elligible");
				}

	}

}
