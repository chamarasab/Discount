import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Color.ANSI_YELLOW+"\n\t\tWelcome to Saloon!" + Color.ANSI_RESET);
        System.out.println(Color.ANSI_GREEN + "Be a member today !" + Color.ANSI_RED + " Premium-20%, Gold-15% and Silver-10%" + Color.ANSI_RESET);
        String name,membertype="";
        boolean ismember;
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();

        System.out.print("\nEnter customer name : ");
        name = scanner.next();

        System.out.print("Is customer a member" + Color.ANSI_RED + " [true/false] " + Color.ANSI_RESET + ":");
        ismember = scanner.nextBoolean();

        if (ismember==false) {
            customer.setMemberType("none");
        } else {
            System.out.print("Enter customer member type" + Color.ANSI_RED + " [Premium/Gold/Silver] " + Color.ANSI_RESET + ":");
            membertype = scanner.next();
        }
        

        customer.setName(name);
        customer.setMember(ismember);
        customer.setMemberType(membertype);

        customer.display();


        Date date = new Date();  
        Visit visit = new Visit(customer, date);
        visit.setProductExpense(4.0); //setServiceExpense...
        visit.setServiceExpense(6.0);
        visit.display();

        scanner.close();
    }
}
