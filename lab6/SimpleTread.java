package labs_java.lab6;

public class SimpleTread extends Thread {
    private int limit;
    private long res = 1;
    private Counter counter;

    public SimpleTread (Counter counter, int limit){
        this.counter = counter;
        this.limit = limit;
    }

    @Override
    public void run(){
        try {
            if (limit > 0){
                for (int i = 2; i <= limit; i++){
                    res *= i;
                    i++;
                }
            } else if (limit < 0){
                for (int i = -2; i >= limit; i--){
                    res *= i;
                    i--;
                }
            }
            counter.addCounter(res);
        } catch (Exception e) {

        }
    }

    public long getRes() {
        return res;
    }


}
