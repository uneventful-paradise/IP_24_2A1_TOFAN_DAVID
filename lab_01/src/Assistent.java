public class Assistent extends Employee {
    public Assistent(String aName){
        setName(aName);
        setSpecialty(Specialties.NONE);
    }
    public void canPerformSurgery(){
        System.out.println("God no!");
    }
}
