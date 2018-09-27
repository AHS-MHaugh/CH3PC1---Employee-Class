/**
 *Michael Haugh
 *Project CH3PC1
 *Programming III - AP CS
 *9-26-18
 */
public class EmployeeNew {
    // ^This is the class.^
    
    private String name;
    private int idNumber;
    private String department;
    private String position;
    // ^These are the variables.^
    
    public EmployeeNew(String n, int i, String d, String p){
    // ^This is the constructor.^
        
    name = n;
    idNumber = i; 
    department = d;
    position = p;
    }
    // ^These are the attributes.^
    
    public void setName(String n){
        name = n;
    }
    // ^This is the accessor method.^
    
    public String getName(){
        return name;
    }
    // ^This is the mutator method.^
    public void setIdNumber(int i){
        idNumber = i;
    }
    public int getIdNumber(){
        return idNumber;
    }
    public void setDepartment(String d){
        department = d;
    }
    public String getDepartment(){
        return department;
    }
    public void setPosition(String p){
        position = p;
    }
    public String getPosition(){
        return position;
        }
}
