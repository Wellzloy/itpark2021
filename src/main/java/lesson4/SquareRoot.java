package lesson4;

public class SquareRoot {

    public static void main(String[] args) {
        double fuiiSquare = 1;
        double insert =100;

        for (double counter =1; fuiiSquare <= insert; ++counter, fuiiSquare = counter * counter){
            // System.out.println ("Текущее значение счетчика:" + counter);
            //System.out.println("Значение полного квадрата:" + fuiiSquare);
            double x, x1;
            double medium, medium1;
            double x2 = insert;

            x = x2/counter;
            //System.out.println(x);
            medium = (counter + x)/2;
            //System.out.println(medium);
            x1 = x2/medium;
            //System.out.println(x1);
            medium1 = (medium + x1)/2;
            System.out.println("Квадратный корень из:" +x2);
            System.out.println("Равен:" +medium1);




        }




    }


}



