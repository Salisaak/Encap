package Encap;



    //Declare the variables of a class as private.

   // Provide public setter and getter methods to modify and view the variables values.
public class LearningEncap {
        private String user;
        private String idNum;
        private int age;

        public int getAge() {
            return age;
        }
        public String getUser() {
            return user;
        }
        public String getIdNum() {
            return idNum;
        }
        public void setAge( int newAge) {
            age = newAge;
        }
        public void setName(String userName) {
            user = userName;
        }
        public void setIdNum( String newId) {
            idNum = newId;
        }
    public static void main(String args[]) {
        LearningEncap encap = new LearningEncap();
        encap.setName("Yjol D.");
        encap.setAge(69);
        encap.setIdNum("173842");

        System.out.print("Name : " + encap.getUser() + " Age : " + encap.getAge() + " ID : "+ encap.getIdNum());
    }


    }

