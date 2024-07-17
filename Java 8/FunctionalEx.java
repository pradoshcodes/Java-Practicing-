import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalEx {
    public static void main(String[] args) {
        Function<String,Integer> fun1=x->x.length();
        Function<String,Integer> fun2=s->s.substring(0,3);
        Function<List<Student>,List<Student>> stud=li->
        List<Student> result=new ArrayList<>();
        for (Student  s : li) {
            if(Function.apply(s.getName()).equalsIgnoreCase("vip")){
                result.add(s);
            }
        }
        return result;
    };

    Student s1=new Student("vipul",2);

    Student s2= new Student("Harish",3);

    Student s3=new Student("Dinesh",4);
    List<Student> students=Arrays.asList(s1,s2,s3);
    List<Student>  stud2=stud.apply(students);
    System.out.println(stud2);
    private static class Student{
        private String name;
        private int id;
        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getId() {
            return id;
        }
        @Override
        public String toString() {
            return "Student [name=" + name + ", id=" + id + "]";
        }
        public void setId(int id) {
            this.id = id;
        }
}




}
