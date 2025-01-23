public class OddAndEven {
    public static void main(String[] args) {
        int number = 9;
        String result = OddAndEven(number);
        System.out.println(result);
    }
    public static  String OddAndEven(int number){
        if(number % 2== 0){
            return number + " is even.";

        }else{
            return number + " is odd.";
        }
    }
}
