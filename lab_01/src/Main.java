public class Main {
    public static void main(String[] args) {
        PrivateHostpital h1 = new PrivateHostpital("Sfanta Maria");
        Doctor d1 = new Doctor("Mihai Andrei");
        Assistent a1 = new Assistent("Popescu Dan");
        h1.addEmployee(d1);
        h1.addEmployee(a1);
        h1.freeAccess();
        h1.getEmployees(Specialties.Cardiology);
        h1.getEmployees(Specialties.ER);
        PublicHostpital h2 = new PublicHostpital("Sfantul Ioan");
        Assistent a2 = new Assistent("Marius");
        Assistent a3 = new Assistent("Relu");
        h2.addEmployee(a2);
        h2.addEmployee(a3);
        h2.getEmployees(Specialties.None);
        h2.removeEmployee("Marius");
        h2.getEmployees(Specialties.None);
    }
}