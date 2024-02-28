import java.util.Objects;

public class PublicHostpital implements Hospital {
    Employee[] emp = new Employee[50];
    int empIndex = 0;
    String name;

    public PublicHostpital(String hName){
        name = hName;
    }

    public void addEmployee(Employee employee){
        emp[empIndex++] = employee;
    }
    public void removeEmployee(String name){
        for (int i = 0; i < empIndex; i++) {
            if (Objects.equals(emp[i].getName(), name)) {
                for (int j = i + 1; j < empIndex; j++) {
                    emp[j - 1] = emp[j];
                }
                empIndex--;
                break;
            }
        }
    }
    public int getNoEmp(){
        return empIndex;
    }
    public void getEmployees(Specialties s){
        for (int i = 0; i < empIndex; i++) {
            if (emp[i].getSpecialty() == s) {
                System.out.println("Name: " + emp[i].getName());
            }
        }
    }
    public void freeAccess(){
        System.out.println("Public Access");
    }
}
