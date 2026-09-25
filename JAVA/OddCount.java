class OddCount{
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 500; i++) {

            if (i % 2 != 0) {
                count++;
            }
        }

        System.out.println("Total odd numbers = " + count);
    }
}