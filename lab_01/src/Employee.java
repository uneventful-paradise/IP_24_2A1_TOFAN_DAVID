public abstract class Employee {
    protected String name;
    protected Specialties s;
    Specialties getSpecialty(){
        return s;
    }
    void setSpecialty(Specialties spec){
        this.s = spec;
    }
    String getName(){
        return name;
    }
    void setName(String newName){
        this.name = newName;
    }
    abstract void canPerformSurgery();
}
