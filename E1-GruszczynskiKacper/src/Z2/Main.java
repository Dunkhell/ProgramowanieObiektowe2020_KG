package Z2;

public class Main {

    public static void main(String[] args) {
        IntSequenceSquare sequenceSquare = IntSequenceSquare.of(3, 1, 4, 1, 5, 9);
        for(int i=0;(i<10)&&(sequenceSquare.hasNext());i++){
            System.out.println(sequenceSquare.next());
        }

        System.out.println("==================================");

        IntSequenceSquare square = IntSequenceSquare.square(3);
        for(int i=0;(i<10)&&(square.hasNext());i++){
            System.out.println(square.next());
        }
    }
}
