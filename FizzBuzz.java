
class FizzBuzz{

  // values uses to replace numbers
  // String fizz =  "Fizz";
  // String buzz = "Buzz";
  // String fizzBuzz = "FizzBuzz";

  // create a for loop that will go through 100
  public static void main(String[] args){

    //for loop that prints values 1 - 100
    for(int i = 1; i < 101; i++){

      // if statement for fizzbuzz, fizz, and buzz
        // start with the greatest restrictions
      if((i % 3) == 0 && (i % 5) == 0 ){

        // replace the value of i with fizz buzz
        System.out.print("FizzBuzz " + "\n");

          // check remained of 5
      }else if((i % 5) == 0 ){

        // replace the value of i with buzz
        System.out.print("Buzz" + "\n");

        //checkes the remainder of 3 
      }else if((i % 3) == 0 ){

        // replace the value of i with fizz
        System.out.print("Fizz" + "\n");

      }else{
        //default prints number value
          System.out.println(i);
      }
    }
  }

}
