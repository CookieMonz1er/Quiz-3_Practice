public class trust {



    public class Student{

     public String name;
     public int id;
     public double gpa;


     public Student(String n, int i, double g){
         name = n;
         id = i;
         gpa = g;
     }
     public void printInfo(){
         System.out.println(name + " " + id + " " + gpa);
     }




    }


    public void main(String[] args) {
        Student s1 = new Student("Ali" , 123, 3.1);
        s1.printInfo();
    }







}
