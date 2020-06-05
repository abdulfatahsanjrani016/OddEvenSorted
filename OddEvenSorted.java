import java.util.*;
/**
 *
 * @author Abdul Fatah
 */
public class OddEvenSorted {
    
    public static void main(String[] args) {
        int arrData[] = { 1, 2, 4, 3, 7, 16 }; 
        oddEvenSort(arrData, arrData.length); 
        System.out.println(Arrays.toString(arrData)); 
    }
    static void oddEvenSort(int arrData[], int arrLength) {
       
        for (int i = 0; i < arrLength; i++){ 
            if ((arrData[i] & 1) != 0){ // Check for odd 
                arrData[i] *= -1; 
            }
        }
         
        Arrays.sort(arrData);  
        for (int i = 0; i < arrLength; i++){ 
            if ((arrData[i] & 1) != 0){ 
                arrData[i] *= -1; 
            }
        }
    }
}