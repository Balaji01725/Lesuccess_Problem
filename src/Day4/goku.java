package Day4;

import java.util.Arrays;

public class goku {
    public static void main(String[] args) {
        int gokuEnergy=35;
        int[] arr={85,65,5,2};
        System.out.println(findGoNextLevelOrNot(gokuEnergy,arr));
    }
    static boolean findGoNextLevelOrNot(int gokuEnergy,int[] arr){
        int count=0;
        int kill=0;
        Arrays.sort(arr);
        for(int zi:arr){
            if(gokuEnergy>=zi){
                kill=(zi%2)+(zi/2);
                gokuEnergy-=kill;
                count++;
            }else{
                System.out.println(count);
                return false;
            }
        }
        System.out.println(count);
        return true;

    }
}
