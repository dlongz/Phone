public class PhoneTest {
    public static void main(String[] args) {
        Galaxy s10 = new Galaxy("s10", 99, "T-Mobile", "RING RING RING");
        IPhone XII = new IPhone("XII", 88, "Verizon", "Ding Ding Ding Ding");

        s10.displayInfo();
        System.out.println(s10.ring());
        System.out.println(s10.unlock());
        
        XII.displayInfo();
        System.out.println(XII.ring());
        System.out.println(XII.unlock());
    }
}
