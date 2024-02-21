import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class Printer {
    public static void main(String[] args){
        ToyGenerator result = new ToyGenerator();
        Object[] res = result.GetArrayToy();
        System.out.println(Arrays.toString(res));
//        for (int i = 0; i < res.length;i++){
//            String str1 = result.toString();
//            System.out.println(str1);
//        }


    }    
}
