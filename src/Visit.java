import java.util.Date;

public class Visit {
    private Customer customerName;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    public Visit(Customer customerName, Date date) {
        this.customerName = customerName;
        this.date = date;
    }

    public Customer getCustomerName() {
        return customerName;
    }

    public void setCustomerName(Customer customerName) {
        this.customerName = customerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        Discount discount = new Discount();
        return getProductExpense()-(getServiceExpense()*discount.getServiceDiscountRate(customerName.getMemberType()))
              +getServiceExpense()-(getProductExpense()*discount.getProductDiscountRate(customerName.getMemberType())); 
    } 

    public void display(){
        System.out.println(Color.ANSI_YELLOW + "\n\tVisit" + Color.ANSI_RESET);
        System.out.println(Color.ANSI_GREEN + "Customer Name : " + Color.ANSI_RED + customerName.getName() + Color.ANSI_RESET);
        System.out.println(Color.ANSI_GREEN + "Date : " + Color.ANSI_RED + getDate() + Color.ANSI_RESET);
        System.out.println(Color.ANSI_GREEN + "Service Expense : " + Color.ANSI_RED + getServiceExpense() + Color.ANSI_RESET);
        System.out.println(Color.ANSI_GREEN + "Product Expense : " + Color.ANSI_RED + getProductExpense() + Color.ANSI_RESET);
        System.out.println(Color.ANSI_GREEN + "Total Expense : " + Color.ANSI_RED + getTotalExpense() + Color.ANSI_RESET);
    }
}
