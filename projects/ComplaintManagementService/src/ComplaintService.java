
public class ComplaintService {
	
	public Complaint createComplaint(Complaint complaint){
		System.out.println("Service-create Method");
		ComplaintDAO dao = new ComplaintDAO();
		dao.createComplaint(complaint);
		return null;
	}
	
	public Complaint updateComplaint(Complaint complaint){
		System.out.println("Service-update Method");
		ComplaintDAO dao = new ComplaintDAO();
		dao.updateComplaint(complaint);
		return null;
	}
	
	public int deleteComplaint(int complaintId){
		System.out.println("Service-delete Method");
		ComplaintDAO dao = new ComplaintDAO();
		dao.deleteComplaint(complaintId );
		return 0;
	}
	
	public Complaint getComplaint(int complaintId){
		System.out.println("Service-get Method");
		ComplaintDAO dao = new ComplaintDAO();
		dao.getComplaint(complaintId);
		return null;
	}

}
