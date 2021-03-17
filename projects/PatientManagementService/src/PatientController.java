public class PatientController{

	public Patient createPatient(Patient patient){
	System.out.println("Controller-createPatient");
	PatientService patientService = new PatientService();
	patientService.createPatient(patient);
	return null;
	}

	public Patient updatePatient(Patient patient){
	System.out.println("Controller-updatePatient");
	PatientService patientService = new PatientService();
	patientService.updatePatient(patient);
	return null;
	}

        public int deletePatient(long patientId){
	System.out.println("Controller-deletePatient");
	PatientService patientService = new PatientService();
	patientService.deletePatient(patientId);
	return 0;
	}

	public Patient getPatientById(long patientId){
	System.out.println("Controller-getPatientById");
	PatientService patientService = new PatientService();
	patientService.getPatientById(patientId);
	return null;
	}

	public Patient getPatientByPhoneNumber(long phoneNumber){
	System.out.println("Controller-getPatientByPhoneNumber");
	PatientService patientService = new PatientService();
	patientService.getPatientByPhoneNumber(phoneNumber);
	return null;
	}
/*
	Public List<Patient> getAllPatients(){
	System.out.println("Controller-getAllPatients");
	return null
	}  */

}