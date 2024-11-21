class Utils {
    static String createSquare(int size) {
        StringBuilder squareBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                squareBuilder.append("#");
            }
            squareBuilder.append(System.lineSeparator());
        }
        return squareBuilder.toString();
    }
    
}


//class Utils {
//    static String createSquare(int size) {
//        public static void main(String[] args) {
//            var scanner = new java.util.Scanner(System.in);
//            int Spuare = scanner.nextInt();
//             scanner.close();
//    
//             for (int i = 0; i < Spuare; i++) {
//                for (int j = 0; j < Spuare; j++) {
//                    System.out.print("#");
//                }
//                System.out.println();
//            }
//    }
//    
//}
