package in.ineuron.entities;

//Dependent Class
public class Branch
{
	private String bid;
	private String bloc;
	
	// Constructor Injection
	public Branch(String bid, String bloc) {
		
		this.bid = bid;
		this.bloc = bloc;
	}
	
	// Getters to get the value
	 public String getBid()
	 {
		 return bid;
	 }
	 
	 public String getBloc()
	 {
		 return bloc;
	 }
	
	
}
