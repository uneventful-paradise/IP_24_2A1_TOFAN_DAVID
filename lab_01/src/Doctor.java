public class Doctor extends Employee{
    public Doctor(String dName){
        setName(dName);
        setSpecialty(Specialties.Cardiology);
    }
    public void canPerformSurgery(){
        System.out.println("Hell yea!");
    }
}
