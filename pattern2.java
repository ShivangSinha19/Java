public class pattern2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                int n = 0;
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        
    }
}}
