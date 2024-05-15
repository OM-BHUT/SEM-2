public class Q11 {
    public static void main(String[] args) {
        String s = "String";
        for(int i=0;i<6;i++){
            for(int k=i;k<=5;k++){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
