package Z2;

public interface IntSequenceSquare {
    static IntSequenceSquare of(int... integers) {
        return new IntSequenceSquare() {
            @Override
            public int next() {
                return wsk < integers.length ? integers[wsk++] : 1;
            }

            private int wsk=0;
        };
    }
    static IntSequenceSquare square(int from){
        return new IntSequenceSquare() {
            int myInt = from-1;
            @Override
            public int next() {
                return (int) Math.pow(myInt,2);
            }

            @Override
            public boolean hasNext() {
                myInt++;
                return true;
            }
        };
    }

    default boolean hasNext(){
        return true;
    }
    int next();
}
