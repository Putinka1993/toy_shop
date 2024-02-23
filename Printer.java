import java.io.IOException;
import java.util.*;

public class Printer {
    public static void main(String[] args){
        ToyGenerator result = new ToyGenerator();
        List<Toy> res = result.GetArrayToy();
        System.out.println(res);
        for (int i = 0; i < res.size(); i++){
            Random rand = new Random();
            int weight = rand.nextInt(1, 101);

            if (weight <= 20){
                for (Toy toy: res){
                    if (toy.getLossRate() > 0 && toy.getLossRate() <= 20){
                        System.out.println(res.get(i));
                        res.get(i).setLossRate(0);
                    }
                }

            }

            if (weight > 20 && weight <= 40){
                for (Toy toy: res){
                    if (toy.getLossRate() > 20 && toy.getLossRate() <= 40){
                        System.out.println(res.get(i));
                        res.get(i).setLossRate(0);
                    }
                }

            }

            if (weight > 40 && weight <= 100){
                for (Toy toy: res){
                    if (toy.getLossRate() > 40 && toy.getLossRate() <= 100){
                        System.out.println(res.get(i));
                        res.get(i).setLossRate(0);
                    }
                }

            }


        }
//        Random rand = new Random();
//        int index = rand.nextInt(toysArr.length);

//        int[] weights = {20, 40, 60};


    }    
}
// вывод массива, запись выданной игрушки в текстовый файл, по порядку