public class PatientService{

	public Patient createPatient(Patient patient){
	System.out.println("Service-createPatient");
	PatientDAO patientDAO = new PatientDAO();
	patientDAO.createPatient(patient);
	return null;
	}

	public Patient updatePatient(Patient patient){
	System.out.println("Service-updatePatient");
	PatientDAO patientDAO = new PatientDAO();
	patientDAO.updatePatient(patient);
	return null;
	}

        public int deletePatient(long patientId){
	System.out.println("Service-deletePatient");
	PatientDAO patientDAO = new PatientDAO();
	patientDAO.deletePatient(patientId);
	return 0;
	}

	public Patient getPatientById(long patientId){
	System.out.println("Service-getPatientById");
	PatientDAO patientDAO = new PatientDAO();
	patientDAO.getPatientById(patientId);
	return null;
	}

	public Patient getPatientByPhoneNumber(long phoneNumber){
	System.out.println("Service-getPatientByPhoneNumber");
	PatientDAO patientDAO = new PatientDAO();
	patientDAO.getPatientByPhoneNumber(phoneNumber);
	return null;
	}
/*
	Public List<Patient> getAllPatients(){
	System.out.println("getAllPatients");
	return null
	}  */


}