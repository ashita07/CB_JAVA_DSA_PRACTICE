public class Person {
   private String name="kaju";
    private int age=30;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setname(String name){
        this.name=name;
    }
   public void ageSet(int age) throws Exception {
      try {
           if (age < 0 || age > 78) {
               throw new Exception("age is not -ve");
           }
           this.age = age;
       }catch(Exception exp){
          exp.printStackTrace();
      }
   }
//    public void ageSet(int age) throws Exception {
//        if(age<0 || age>78){
//            throw new Exception("age is not -ve");
//        }
//        this.age=age;
//    }
   public int ageGet(){
        return age;
   }


public String getname() {
return name;
}}
