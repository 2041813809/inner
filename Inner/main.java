package Inner;

public class main {
    public static void main(String[] args) {

        inner i = new inner();

        i.animal(new inter() {
            @Override
            public void jump() {
                System.out.println("喵咪爱跳高");
            }
        });
    }
}
