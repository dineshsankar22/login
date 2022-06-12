package training.core.servlets;

public class ValidateUser {
	String userName = "Dineshkumar";
	String password = "Dinu@321";
	public boolean isvalid = false;
	
	public boolean valid(String user,String pass){
		if(user.equals(userName) && pass.equals(password)){
			 isvalid = true;
			
		}
		else{
			isvalid= false;
		}
		
		return isvalid;
		
	}

}
