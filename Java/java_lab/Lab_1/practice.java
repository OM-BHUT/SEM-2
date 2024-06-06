/**
 * practice
 */
public class practice {

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            // for(int j=0;j<5;j++){
            //     System.out.println("j="+j); 
            //     if(j==3){
            //         break;
            //     }
            // }
            if(i==3){
                continue;
            }
            System.out.println("i="+i);

        }
        System.out.println("loop completed");
    }
}