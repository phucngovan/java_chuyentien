import java.util.Scanner;

public class chuyen_tien {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double usa,vnd=23000;
        System.out.println("nhập số tiền USD:");
        usa=Double.parseDouble(sc.nextLine());
        double quydoi=usa*vnd;
        System.out.println("Giá trị VND" + quydoi);
    }
}
