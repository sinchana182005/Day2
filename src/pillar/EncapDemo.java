package pillar;

public class EncapDemo {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setUSN(105);
        s1.setEmail("abc@gmail.com");
        System.out.println(s1.getUSN());
        System.out.println(s1.getEmail());
    }
}
