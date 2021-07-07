public class Worker {
     String  name;
     String post;
     String email;
     long phoneNumber;
     int money;
     int age;

          Worker( String  name, String post, String email, long phoneNumber, int money, int age){
               this.name = name ;
               this.post = post ;
               this.email = email ;
               this.phoneNumber = phoneNumber ;
               this.money = money ;
               this.age =  age;
          }
     void workerInfo(){
          System.out.println(name + " " + post + " " + email + " " + phoneNumber + " " + money + " " + age);
     }
}
