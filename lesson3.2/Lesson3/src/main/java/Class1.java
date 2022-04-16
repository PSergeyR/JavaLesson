import ru.pflb.mq.dummy.exception.DummyException;
import ru.pflb.mq.dummy.implementation.ConnectionImpl;
import ru.pflb.mq.dummy.implementation.SessionImpl;
import ru.pflb.mq.dummy.interfaces.Connection;
import ru.pflb.mq.dummy.interfaces.Destination;
import ru.pflb.mq.dummy.interfaces.Producer;
import ru.pflb.mq.dummy.interfaces.Session;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public  class Class1 {
    public static void main(String[] args) throws DummyException, InterruptedException, IOException {
        Connection conn = new ConnectionImpl();
        Session session = conn.createSession(true);
        Destination destination = session.createDestination("Test");
        Producer producer = session.createProducer(destination);

        List<String> messageOnFile = new ArrayList<>();

        //Задание 2.1
//        BufferedReader reader = new BufferedReader(new FileReader("messages.dat"));
//
//        while (reader.ready()) {
//            messageOnFile.add(reader.readLine());
//        }
//        int i = 0;
//
//
//        while (i < messageOnFile.size()) {
//
//            Thread.sleep(2000);
//            producer.send(messageOnFile.get(i));
//            i++;
//        }
//
//        session.close();
//        conn.close();

        //Задание 2.2
//        String path = args[0];
//
//        BufferedReader reader = new BufferedReader(new FileReader(path));
//
//        while (reader.ready()) {
//            messageOnFile.add(reader.readLine());
//        }
//        int i = 0;
//
//
//        while (i < messageOnFile.size()) {
//
//
//            Thread.sleep(2000);
//            producer.send(messageOnFile.get(i));
//            i++;
//            if(i==messageOnFile.size())
//                i=0;
//        }
//
//        session.close();
//        conn.close();
    }
    }



