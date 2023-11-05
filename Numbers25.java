import java.util.Arrays;

public class Numbers25 {
    
    public static void main(String[] args) {
        
        int[][] myNummbers = new int[3][];
        myNummbers[0] = new int[5];
        myNummbers[1] = new int[3]; 
        myNummbers[2] = new int[1];

        for (int r = 0; r<myNummbers.length; r++){
            System.out.println(Arrays.toString(myNummbers[r]));
            
            }
            for (int a=0; a<myNummbers.length; a++){
                System.out.println("panjang baris ke-" + a + " : "+myNummbers[a].length);
        }
    
    }
}
