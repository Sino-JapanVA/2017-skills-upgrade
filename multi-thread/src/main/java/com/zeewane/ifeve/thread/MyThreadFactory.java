package com.zeewane.ifeve.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**
 * 线程工厂类
 * @author qizw19186
 *
 */
public class MyThreadFactory implements ThreadFactory {

    private int          counter;
    private String       name;
    private List<String> status;

    public MyThreadFactory(String name) {
        counter = 0;
        this.name = name;
        status = new ArrayList<String>();
    }

    public String getStatus() {
        StringBuffer sb = new StringBuffer();
        Iterator<String> it = status.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, name + "-Thread_" + counter);
        counter++;
        status.add(String.format("created thread %d with name %s on %s\n", t.getId(), t.getName(),
            new Date()));
        return t;
    }

}