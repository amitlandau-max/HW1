public class Assignment01Q01 {
    public static void main(String[] args) {
        for (int i = 1; i <= args.length; i++) {
            char first = args[i - 1].charAt(0);
            if (first % 5 == 0) {
                System.out.println(first);
            }
        }
        
    }
}
