import ru.pflb.mq.dummy.exception.DummyException;
import ru.pflb.mq.dummy.implementation.ConnectionImpl;
import ru.pflb.mq.dummy.implementation.SessionImpl;
import ru.pflb.mq.dummy.interfaces.Connection;
import ru.pflb.mq.dummy.interfaces.Destination;
import ru.pflb.mq.dummy.interfaces.Producer;
import ru.pflb.mq.dummy.interfaces.Session;

import java.util.ArrayList;

public  class Class1 {
    public static void main(String[] args) throws DummyException, InterruptedException {
        Connection conn = new ConnectionImpl();
        Session session = conn.createSession(true);
        Destination destination = session.createDestination("Test.foo");
        Producer producer = session.createProducer(destination);
        ArrayList<String> messages = new ArrayList<String>();
        messages.add("Четыре");
        messages.add("Пять");
        messages.add("Шесть");
        for (int i=0; i< messages.size();i++) {
            Thread.sleep(2000);
            producer.send(messages.get(i));
        }
        session.close();
        conn.close();


    }










    }



