public class Q3 {
    public static void main(String[] args) {
        Spray spray = new Spray("あ");
        Spray left = new Spray("か");
        spray.setLeft(left);
        Spray right = new Spray("さ");
        spray.setRight(right);

        left.setLeft(new Leaf("た"));
        left.setRight(new Leaf("な"));
        right.setLeft(new Leaf("は"));
        right.setRight(new Leaf("ま"));

        System.out.print (spray.getName());
        System.out.print (spray.getLeft().getName());
        System.out.print (spray.getRight().getName());
        System.out.print (left.getLeft().getName());
        System.out.print (left.getRight().getName());
        System.out.print (right.getLeft().getName());
        System.out.print (right.getRight().getName());
    }
}
