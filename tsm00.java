public class tsm00{
    private int counter;

    public synchronized void increment(){
        counter++;
    }
    public synchronized void decrement(){
        counter--;
    }
    public synchronized int getCounter(){
        return counter;
    }
}