class Password {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        String password = scanner.nextLine();
        scanner.close();
        int passwordLength = password.length();

        if (passwordLength >= 5 && passwordLength <= 8) {
            System.out.println("Password length OK");
        } else if (passwordLength < 5) {
            System.out.println("Password too short");
        } else {
            System.out.println("Password too long");
        }
    }
}
