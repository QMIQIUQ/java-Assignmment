public class Student {
	
    private String name;
    private double gpa;
    public Student() {
    }
    
    public Student(String newName){
    	name = newName;
    }
    
    public String getName(){
    	return name;
    }

    public void setName(String newName){
    	name = newName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

   
}