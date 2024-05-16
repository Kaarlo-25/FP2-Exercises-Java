public class SteppedCounter {
    protected int counter, stepValue;
    public SteppedCounter(int step) {
        this.counter = 0;
        this.stepValue = step;
    }

    public void step() {
        this.counter += this.stepValue;
    }

    public int getValue(){
        return this.counter;
    }

    public void reset(){
        this.counter = 0;
    }
}
