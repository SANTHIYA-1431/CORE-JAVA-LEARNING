public class stringcreation{
    public static void main(String[] args) {
        String a1 = "sandy";
        String a2 = "sandy";
        String a3 = new String( "sandy");
        String a4 = new String ("sandy");
        System.out.println(a1==a2);//both locations are saved in same address
        System.out.println(a1==a3);// a3 is saved in a new address
        System.out.println(a4==a3);//both of them created in a new address
    
    }
    
}

