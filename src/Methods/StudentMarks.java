package Methods;

public class StudentMarks {

    public void Name(String name , int marks){
        System.out.println(name + " "  + marks);
    }

    public static void main(String[] args) {
        StudentMarks obj = new StudentMarks();

         obj.Name("Vinay" , 97);

    }

}
