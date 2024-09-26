import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Shop shop= new Shop(new Person("John", "email"),"Lahore");
        Scanner sc = new Scanner(System.in);
        while(true) {
System.out.println("Enter your choice: \nEnter 0 to exit\nEnter 1 to add\nEnter 2 to sale\nEnter 3 to modify\nEnter 4 to Display");
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                shop.addProduct();
                break;
                case 2:
                    shop.sale();
                    break;
                case 0:
System.out.println("You have exited the program");
                   System.exit(0);
                   break;
                default:
            }
        }
    }
}