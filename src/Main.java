package week3.summary_session.box_with_cats;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 2, "Black");
        Box box = new Box("FirstBox", true, 1, cat);
        System.out.println(box);
//        box.empty();
        System.out.println(box);
        System.out.println(box.makeCopy().getCat().equals(box.getCat()));
        System.out.println(box.makeCopy().getCat() == (box.getCat()));
        System.out.println(box.deepCopy().getCat().equals(box.getCat()));
        System.out.println(box.deepCopy().getCat() == (box.getCat()));

    }

}
