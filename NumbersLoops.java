public class NumbersLoops{
    public NumbersLoops(){
        // while that prints 0 - 10
      int index = 0;
      while (index < 11){
        System.out.println(index);;
        index ++;
      }
      System.out.println(index);
        // for i looop prints 0 - 10
      
      for(int index2 = 0; index2 < 11; index2++){
        System.out.println(index2); 
      }

      }

      // other way to do it!!
    //   int index2 = 0;
    //   for(; index2 < 11;) {
    //           System.out.println(index2);
    //           index2++;
    //         }
    // }
  
    public int digitSum(int num){

      int x = 0;
      int sum = 0;
      while(x<=num){
        sum += x++; //post increment operator omg
      }
      return sum;
    }
  
    public int reverseNum(int num){
      // 123 mod 10 ==> 3

      // //use mod to find last digit 
      // // use integer division to get first few digits
      // //use mod to get second to last digit
      // int bum = 0;
      // //while (num > 0){
      // int x = num % 10;
      // int y = num / 10;
      // int z = y % 10;
      // int a = y / 10;
      // bum = x*100 + z*10 + a; 
      // //}
      // //}
      // return bum;

      int newNum = 0;
      while (num > 0){
        newNum = newNum * 10 + num%10;
        num = num/10;
      }
      return newNum;
    }

  
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){

      int count = 0;
      while(start <= finish){
        if(start++ == reverseNum(start)){
          count++;
        }
      }
      //start++;
      return count;
    }
  
  
  }
