public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer() {
    }
    public Customer(String name) {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isMember() {
        return member;
    }
    public void setMember(boolean member) {
        this.member = member;
    }
    public String getMemberType() {
        return memberType;
    }
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    public void display(){
        System.out.println(Color.ANSI_YELLOW + "\n\tCustomer" + Color.ANSI_RESET);
        System.out.println(Color.ANSI_GREEN + "Name : " + Color.ANSI_RED + getName() + Color.ANSI_RESET);
        System.out.println(Color.ANSI_GREEN + "Is member : " + Color.ANSI_RED + isMember() + Color.ANSI_RESET);
        System.out.println(Color.ANSI_GREEN + "Member Type : " + Color.ANSI_RED + getMemberType() + Color.ANSI_RESET);
    }
    
}
