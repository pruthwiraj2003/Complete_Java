public class CompareToStringMethod {
  public static void main(String[] args) {
    String a ="pruthwi";
    String b ="pranita";
    System.out.println(compareTo(a, b));
  }
  public static int compareTo(String a, String b){
    int i = 0;

    int j = 0;
    
    
    while(i<a.length() &&j<b.length()){
      char ch1 = a.charAt(i);
      char ch2 = b.charAt(j);
      if(ch1!=ch2){
         return ch1-ch2;
      }
      i++;
      j++;
    }

    return a.length()-b.length();
  }
}
