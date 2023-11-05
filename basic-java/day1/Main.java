class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(sum(2, 3));
        System.out.println(isEven(8));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

}