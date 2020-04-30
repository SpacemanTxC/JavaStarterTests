// Import statement:
import java.util.ArrayList;

class PrimeDirective {

  // Add your methods here:

  // method returns boolean
  public boolean isPrime(int number){
    //if statement check to see if the number is 2
    if(number == 2){
      return true;
    }else if(number < 2){
      return false;
    }
    // checks to see if can only be div by self
      //checks numbers from 2 to one number belowself
    for(int i = 2; i < number; i++){
      if(number % i == 0){
        return false;
      }
    }
    return true;
  }
  // creats an empty array list named onlyPrimes
  // takes in the int of numbers
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    // new array list to hold primes
    ArrayList<Integer> primes = new ArrayList<Integer>();
    // for each loop to add the prime to array
    for(int number : numbers){
      // use isPrime to check the number
      if(isPrime(number) == true){
        //adds number to numbers array
        primes.add(number);

      }
    }
    return primes;
  }

  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    //TEST
    System.out.println(pd.isPrime(6));

    //Test for Arraylist
    // calls the object pb and then uses only primes to check the numbers in the array
    System.out.print(pd.onlyPrimes(numbers));

  }

}
