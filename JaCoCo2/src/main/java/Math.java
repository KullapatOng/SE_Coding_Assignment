public class Math {
    public static int factorial(int i){
        if(i == 0 || i == 1 ) {

            return 1;
        }
        else if(i < 0){
            throw new IllegalArgumentException("Error, Input should be positive number!");
        }
        return i * (factorial(i - 1));
    }
}
