package labs_java.lab6;

public class Counter {

    public synchronized void addCounter(long res){
        ThreadGenerator.list.add(res);
    }
}
