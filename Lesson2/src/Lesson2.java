import java.io.*;
import java.util.*;

public class Lesson2 {
    //Задание 2ч.2
    public static void PrintLine() throws IOException, InterruptedException {
        Queue<String> queue1 = new LinkedList<>();
        BufferedReader reader2 = new BufferedReader(new FileReader("poem.txt"));
        Random rnd = new Random();

        while (reader2.ready()) {
            queue1.add(reader2.readLine());
        }
        while (!queue1.isEmpty()) {
            Thread.sleep(((rnd.nextInt(2) + 1) * 1000));//Засыпаем на рандомное число (разница значений+1 и умножаем на 1000 т.к. миллисекунды)
            System.out.println(queue1.poll());//Выводим в консоль строку из очереди иудаляем ее .poll
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {


        List<String> stringList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("poem.txt"));


        while (reader.ready()) {
            stringList.add(reader.readLine());
        }

//         for (String str : stringList) {
//            System.out.println(str);
//        }

//        BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"));
//        //Запись всего что есть в файле
//        for (String str : stringList) {
//            writer.write(str);
//            writer.append("\n");
//            writer.flush();
//        }

        //Задание 1

        int i = 0; //СЧЕТЧИК
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("note" + i + ".txt"));
        for (String str : stringList) {

            if (str.equals("") || str.equals("\n")) {
                i++;
                writer1.close();
                writer1 = new BufferedWriter(new FileWriter("note" + i + ".txt"));

            } else {
                writer1.write(str);
                writer1.write("\n");
                writer1.flush();
            }
        }




        //задание 2ч.1

        Queue<String> queue = new LinkedList<>();
        BufferedReader reader1 = new BufferedReader(new FileReader("poem.txt"));
        while (reader1.ready()) {
            queue.add(reader1.readLine());
            //System.out.println(queue);
        }
        PrintLine();


    }


}

