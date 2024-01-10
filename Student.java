class Student{
    String name = "xyz";
    int RollNo = 120;
    public void StudentInfo(){
        System.out.println(name);
        System.out.println(RollNo);
    }
    public static void main(String[] args){
        Student s = new Student();
        s.StudentInfo();
    }
}
