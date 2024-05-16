public class SteppedCounterCloneable extends SteppedCounter implements Cloneable{
    int step;

    public SteppedCounterCloneable(int step){
        super(step);
    }

    @Override
    public SteppedCounterCloneable clone() throws CloneNotSupportedException {
        return (SteppedCounterCloneable) super.clone();
    }
}
