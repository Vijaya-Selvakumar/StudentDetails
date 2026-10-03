public class Student {
       private int id;
       private String name;
       private double marks;
       
       public Student(int id, String name, double marks){
          this.id=id;
          this.name=name;
          this.marks=marks;
       }

       public int getStudentId(){
         return id;
       }

       public String getStudentName(){
        return name;
       }

       public double getStudentMarks(){
        return marks;
       }
       
       public void setStudentId(int id){
        this.id=id;
       }

       public void setStudentName(String name){
        this.name=name;
       }
       public void setStudentMarks(double marks){
        this.marks=marks;
       }

       public String toString(){
       return "Student [Id = "+ id + ", Name =" + name +", Marks ="+ marks + "]";
        
       }

    
}