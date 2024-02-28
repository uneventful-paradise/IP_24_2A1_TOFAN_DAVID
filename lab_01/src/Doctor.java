public class Doctor extends Employee{
    public Doctor(String dName){
        setName(dName);
        setSpecialty(Specialties.CARDIOLOGY);
    }
    public void canPerformSurgery(){
        System.out.println("Hell yea!");
    }
}
