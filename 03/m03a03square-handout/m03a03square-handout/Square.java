class Square {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        int Spuare = scanner.nextInt();
         scanner.close();

         for (int i = 0; i < Spuare; i++) {
            for (int j = 0; j < Spuare; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
}
}
