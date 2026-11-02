public class BlackBox {
    public int findIndexOfLetter(String word, String letter){

        //while loop way
        int x = 0;
        while(!word.substring(x, x+1).equals(letter)){
            x++;
        }
        return x;

        //for loop way
        // for(int x = 0; x < word.length(); x++){
        //     if(word.substring(x, x+1).equals(letter))
        //         return x;
        // }
        // return -1;
    }
}
