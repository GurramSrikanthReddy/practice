public class PatientMainController{

	public static void main(String args[]){

	Patient patient = new Patient();
	// patient.setId(123);
	patient.setFirstName("Srikanth");
	patient.setMiddleName("Reddy");
	patient.setLastName("Gurram");
	patient.setPhoneNumber(9123456789L);
	patient.setEmail("gsrikanth@gmail.com");

	PatientController patientController =  new PatientController();

	patientController.createPatient(patient);
	patientController.updatePatient(patient);
	patientController.deletePatient(223);
	patientController.getPatientById(123);	
	patientController.getPatientByPhoneNumber(989898989);
	}
}