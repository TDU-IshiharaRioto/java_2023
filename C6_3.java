public class C6_3 {
    public static void main(String[] args) {
        UserLocator users = new UserLocator();
        users.add(new Teacher("T999", "����"));
        users.add(new Student("06JK000", "���"));
        users.add(new Staff("S00", "���q"));
        users.printUsers(new PrintVisitor());
    }
}