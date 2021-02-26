package pageObject;

public class FizzBuzzConverter {
    public String convert(int toConvertToFizzBuzz){
        if(toConvertToFizzBuzz%35==0){
            return "fizzbuzz";
        }
        if(toConvertToFizzBuzz%7==0){
            return "buzz";
        }
        if(toConvertToFizzBuzz%5==0){
            return "fizz";
        }
        return String.valueOf(toConvertToFizzBuzz);
    }
}
