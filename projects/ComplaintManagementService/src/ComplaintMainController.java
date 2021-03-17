
public class ComplaintMainController {

	public static void main(String[] args) {

		Complaint complaint = new Complaint(123,"Redmi",9912121212L,"Hyd","Not Working");
		
		System.out.println(complaint.complaintId);
		System.out.println(complaint.name);
		System.out.println(complaint.phone);
		System.out.println(complaint.location);
		System.out.println(complaint.issueDescription);

		ComplaintController complaintController = new ComplaintController();
		
		complaintController.createComplaint(complaint);
		complaintController.updateComplaint(complaint);
		complaintController.deleteComplaint(123);
		complaintController.getComplaint(123);
		
	}

}
