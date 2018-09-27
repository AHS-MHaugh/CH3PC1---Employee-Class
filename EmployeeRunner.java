/**
 *Michael Haugh
 *Project CH3PC1
 *Programming III - AP CS
 *9-26-18
 */
public class EmployeeRunner {
    // ^This is the class.^
    
    public static void main(String[] args) {
        EmployeeNew e = new EmployeeNew("Alex McAuley", 2432, "resource",
        "secretary");
    // ^This is the employee object.^
    
    System.out.println("My name is " + e.getName() + ", my ID number is " + 
     e.getIdNumber() + ", my position is " + e.getPosition() + ", and my "
     + "department is the " + e.getDepartment() + " department.");    
    }
    // ^This is the print command.^
}