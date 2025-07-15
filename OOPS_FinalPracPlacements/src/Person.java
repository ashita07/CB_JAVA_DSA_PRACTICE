public class Person {

   private int age=22;
   private String name="Ashita";
    Person(){

    }
    Person(int age,String name) {
       this.name=name;
       this.age=age;
    }

    public void self_intro() {

        System.out.println(this.name+" "+age);
    }
    }

