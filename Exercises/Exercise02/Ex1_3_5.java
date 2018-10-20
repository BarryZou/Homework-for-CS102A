public class Ex1_3_5 {
    //RoadLoadedDie
    public static void main(String[] args) {

        //Set a model
        double a = 8*Math.random();
        int b = (int)a;
        if (b != 0 && b <= 5) {
            System.out.println(b);
        } else System.out.println( "6" );
    }
}
