public class UpperCaseLetter {
  public static void main(String[] args) {
    uppercase("mohapaTra", 1);
    
  }
  static void uppercase(String str,int index){
      if(index == str.length()){
        System.out.println('\0');
        return;
      }

      char ch = str.charAt(index);
      if(Character.isUpperCase(ch)){
        System.out.println(ch);
        return;
      }

      uppercase(str, index+1);
  }
}
