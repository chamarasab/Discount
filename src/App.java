import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Saloon!");
        String name,membertype="";
        boolean ismember;
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();

        System.out.print("Enter customer name : ");
        name = scanner.next();

        System.out.print("Is customer a member [true/false] : ");
        ismember = scanner.nextBoolean();

        if (ismember==false) {
            customer.setMemberType("none");
        } else {
            System.out.print("Enter customer member type [Premium/Gold/Silver] : ");
            membertype = scanner.next();
        }
        

        customer.setName(name);
        customer.setMember(ismember);
        customer.setMemberType(membertype);

        customer.display();


        Date date = new Date();  
        Visit visit = new Visit(customer, date);
        visit.setProductExpense(1.5); //setServiceExpense...
        visit.setServiceExpense(8.5);
        visit.display();

        scanner.close();
    }
}
