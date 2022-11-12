public class typeCasting {
    public static void main(String[] args){
        ///// Type Casting
        String value = "123";
        int number = Integer.parseInt(value);
        System.out.println(number);
        double number1 = Double.parseDouble(value);
        double number2 = number;
        /// byte number3 = number;//////It will Show Error cos we can not convert large to small
        /*String value = "hi";
        try{
            int number = Integer.parseInt(value);
            System.out.println(number);
        }catch (Exception e)
        {
            e.printStackTrace();
        }*/
    }
}
