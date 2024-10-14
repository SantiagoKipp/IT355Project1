public class exp50{
    public class Student{
        private String id;

        public Student(String id){
            this.id = id;
        }

        public String getID(){
            return name;
        }
        @Override
        public boolean equals(Object obj){
            if (this == obj){
                return true;
            }
            if (getClass() != obj.getClass() || obj == null){
                return false;
            }
            Student stu = (Student) obj
            return id.equals(stu.id);
        }
    }

    public static void main(String[] args){
        Student stu1 = new Student("328");
        Student stu2 = new Student("355");
        Student stu3 = new Student("328");
        if(stu1.equals(stu2)){
            System.out.println("Students 1 and 2 are the same");
        }
        else{
            System.out.println("Students 1 and 2 are different");
        }
        if(stu3.equals(stu1)){
            System.out.println("Students 1 and 3 are the same");
        }
        else{
            System.out.println("Students 1 and 3 are different.")
        }
    }
}