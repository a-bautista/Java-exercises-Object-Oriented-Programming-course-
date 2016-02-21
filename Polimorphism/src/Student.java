
public class Student {
    
    private String name, skills;
    
    Student(){
        name="";
        skills="";
    }
    
    Student(String name, String skills){
        this.name=name;
        this.skills=skills;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setSkills(String skills){
        this.skills=skills;
    }
    
    public String getSkills(){
        return skills;
    }
    
    public String Activity(){
        return "I'm currently studying.";
    }
}
