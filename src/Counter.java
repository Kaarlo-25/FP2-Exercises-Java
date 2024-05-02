public class Counter {
    int counter;
    public Counter(){
        this.counter = 0;
    }
    public void step(){
        this.counter ++;
    }

    public int getValue(){
        return this.counter;
    }
    public void reset(){
        this.counter = 0;
    }
}
