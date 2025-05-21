public class StudentClient {
    public static void main(String[] args) {
        System.out.println("hey");
        Student st=new Student();
        System.out.println(st.name);
        System.out.println(st.age);
        st.name="raj";
        st.age=22;
        System.out.println(st.name);
        System.out.println(st.age);
        Student s1=new Student();
        s1.name="kaju";
        s1.age=21;
        s1.IntroYourself();
s1.SayHey("kamlesh");
s1.Mentorname();

    }
    static{
        System.out.println("i am the student Client class");
    }
}
