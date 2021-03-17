
public class Complaint {
	

	
	int complaintId;
	String name;
	long phone;
	String location;
	String issueDescription;


	public Complaint(int complaintId,String name,long phone,String location,String issueDescription){
		
		this.complaintId = complaintId;
		this.name = name;
		this.phone = phone;
		this.location = location;
		this.issueDescription = issueDescription;
	}

}
