public class removeas {
  public static void main(String[] args) {
    String str = "baccad";
    String str2 = "";
    char[] arr = str.toCharArray();
    for(int i =0;i<arr.length;i++){
      if(arr[i]!='a'){
        str2+=arr[i];
      }
    }
    // System.out.println(str2);
    // removecharacters(" ", " bdaacdff");
    System.out.println(Skip("cdsaagfddaa"));
  }

  static void removecharacters(String p, String up){
    if(up.isEmpty()){
      System.out.println(p);
      return;
    }
    char ch = up.charAt(0);
    if(ch=='a'){
      removecharacters(p, up.substring(1));
    }else{
      removecharacters(p+ch,up.substring(1));
    }

  }

  static String Skip(String up){
    if(up.isEmpty()){

      return " ";
    }
    char ch = up.charAt(0);
    if(ch=='a'){

      return Skip(up.substring(1));
    }else{

      return ch+ Skip(up.substring(1));
    }

  }
}
