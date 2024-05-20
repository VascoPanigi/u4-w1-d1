public class Es3 {

    public static void main(String[] args) {


        System.out.println(rectanglePerimeter(20, 30));
        System.out.println(oddOrEven(3946));
        System.out.println(trianglePerimeter(20, 20, 5));

    }

    public static int rectanglePerimeter(int side1, int side2){
        return (side1+side2)*2;
    }

    public static int oddOrEven(int value){
        if(value % 2 == 0 ){
            return 0;
        }else{
            return 1;
        }
    }

    public static double trianglePerimeter(int side1, int side2, int side3){

        double  semiperimeter = (side1 + side2 + side3)/2.0;

        return  Math.sqrt(semiperimeter*(semiperimeter - side1)*(semiperimeter -side2)*(semiperimeter -side3));

    }


}
