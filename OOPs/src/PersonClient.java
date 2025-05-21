public class PersonClient {
    public static void main(String[] args) throws Exception {
        Person p=new Person("badam",67);
       p.setname("ashita");
        System.out.println(p.getname());
p.ageSet(-5);
        System.out.println(p.ageGet());
    }
}
