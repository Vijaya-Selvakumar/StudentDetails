import java.util.ArrayList;
import java.util.List;



public class StudentManagementSystem {

    List<Student> students = new ArrayList<Student>();

    //AddStudent

    public void addStudent(Student st){
        students.add(st);
    }
    public Student getDataByIndex(int i){
        return students.get(i);
    }
    public List<Student> getAllData(){
        return students;
    }

    public void getStudentById(int id){
        boolean founddata=false;
        for(Student studReg: students)
        {
            if(studReg.getStudentId()==id)
            {
                System.out.println("Found "+studReg);
                founddata=true;
                break;
            }
        }
        if(!founddata)
        {
            System.out.println("Searching data not found");
        }
    }

    public void UpdateStudentDetails(int id, String name){
        boolean UpdatedStatus=false;
        for(Student sr: students)
        {
            if(sr.getStudentId()==id){
                sr.setStudentName(name);
                UpdatedStatus=true;
                System.out.println("Updated Successfully"+sr);
                break;
            }
        }
        if(!UpdatedStatus)
        {
            System.out.println("Data not Found");
        }
    }
public void deleteStudentDetails(int id){
    boolean DeleteDetails=false;
    for(int i=0; i<students.size(); i++)
    {
        if(students.get(i).getStudentId()==id)
        {
            students.remove(i);
            DeleteDetails=true;
            System.out.println("Deleted Successfully");
            break;
        }
    }
    if(!DeleteDetails)
    {
        System.out.println("No Details Found");
    }
}


    public static void main(String[] args) {

        StudentManagementSystem sms =new StudentManagementSystem();
        Student stud = new Student(1, "Raju", 56);
        Student stud1 = new Student(2, "Mani", 78);
        Student stud2 = new Student(3, "Ram", 67);
        Student stud3 = new Student(4, "Sathish", 90);

        sms.addStudent(stud);
        sms.addStudent(stud1);
        sms.addStudent(stud2);
        sms.addStudent(stud3);
        
        System.out.println("Retrive by index***********");
        System.out.println(sms.getDataByIndex(0));

        System.out.println("Retrive All the Details******");
        System.out.println(sms.getAllData());

        System.out.println("Search by Student Id*****");
        sms.getStudentById(2);
        
        sms.UpdateStudentDetails(1, "Eswar");

        System.out.println("Delete Student Details********");
        sms.deleteStudentDetails(3);

        System.out.println(sms.getAllData());


        
    }

    
}