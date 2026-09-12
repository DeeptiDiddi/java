class Largestwithoutandor {
    public static void main(String[] args) {

        int a = 10;
        int b = 35;
        int c = 20;

        if (a > b) {

            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }

        } else {

            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
