import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ToyGenerator {

    public Object[] GetArrayToy(){

        String[] toysArr = {"Кукла", "Машинка", "Конструктор", "Мяч", "Кубики",
                "Настольная игра", "Пазл", "Мягкая игрушка", "Робот", "Фигурка"};
        int[] weights = {20, 20, 60};

        Object[] Toys = new Object[10];

        for (int i = 0; i < toysArr.length; i++) {
            Random rand = new Random();
            int index = rand.nextInt(toysArr.length);  
            int ind = rand.nextInt(weights.length);
            String name = toysArr[index];
            Toys[i] = new Create_toy(i, name, weights[ind]);
        }
        return Toys;
    }
}

//    PriorityQueue<Toys> queue = new PriorityQueue<>(Comparator.comparingInt(toysArr::getWeight));
//
//        for (Toy toy : toys) {
//        queue.add(toy);
//    }



