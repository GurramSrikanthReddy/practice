
public class ComplaintController {
	
	public Complaint createComplaint(Complaint complaint){
		System.out.println("Controller-create Method");
		ComplaintService service = new ComplaintService();
		service.createComplaint(complaint);
		return null;
	}
	
	public Complaint updateComplaint(Complaint complaint){
		System.out.println("Controller-update Method");
		ComplaintService service = new ComplaintService();
		service.updateComplaint(complaint);
		return null;
	}
	
	public int deleteComplaint(int complaintId){
		System.out.println("Controller-delete Method");
		ComplaintService service = new ComplaintService();
		service.deleteComplaint(complaintId);
		return 0;
	}
	
	public Complaint getComplaint(int complaintId){
		System.out.println("Controller-get Method");
		ComplaintService service = new ComplaintService();
		service.getComplaint(complaintId);
		return null;
	}
}
