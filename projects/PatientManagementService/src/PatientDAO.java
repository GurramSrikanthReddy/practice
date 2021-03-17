public class PatientDAO{

	public Patient createPatient(Patient patient){
	System.out.println("DAO-createPatient");
	return null;
	}

	public Patient updatePatient(Patient patient){
	System.out.println("DAO-updatePatient");
	return null;
	}

        public int deletePatient(long patientId){
	System.out.println("DAO-deletePatient");
	return 0;
	}

	public Patient getPatientById(long patientId){
	System.out.println("DAO-getPatientById");
	return null;
	}

	public Patient getPatientByPhoneNumber(long phoneNumber){
	System.out.println("DAO-getPatientByPhoneNumber");
	return null;
	}
/*
	Public List<Patient> getAllPatients(){
	System.out.println("DAO-getAllPatients");
	return null
	}  */

}