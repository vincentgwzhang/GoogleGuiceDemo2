package org.vincent.demo.retry.task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

public class CallABC implements Callable<Void> {

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public Void call() throws Exception {

        int abc = 3;
        System.out.println("Start time: " + dateFormat.format(new Date()));
        System.out.println("============= You Jian Xue Piao Guo================");

        if (abc == 3) {
            System.out.println("End time: " + dateFormat.format(new Date()));
            throw new RuntimeException();
        }
        return null;
    }

}
