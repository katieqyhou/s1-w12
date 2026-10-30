public class StringsLoops{
    public StringsLoops(){
  
    }
  
    public int length(String s){
      int count = 0;
      while(!s.equals("")){
        s = s.substring(1);
        count++;
      }

      return count;
    }
  
    public String copy(String s, int num){
      int variable = 0;
      while(num <= s.length()){
        ;
        num++;
      }
      return s;
    }
  
    public String interweaving(String s1, String s2){
      int i = 0;
      String newStr = "";
      while (i < s1.length()){
        newStr += s1.substring(i, i+1) + s2.substring(i, i+1);
        i++;
      }
      return newStr;
    } 
  
  
  }