public class Stream{
  public static void main(String[] args){
    skip(" ", "baccdah");
    System.out.println(SkipAppNotApple("baccappldefr"));

  }
  static void skip(String p, String up){
    if(up.isEmpty()){
      System.out.println(p);
      return;
    }
    char ch = up.charAt(0);
    if(ch == 'a'){
      skip(p,up.substring(1));
    }else{
        skip(p+ch,up.substring(1));
    }
  }
  static String SkipApple(String up){
    if(up.isBlank()){
      return "";
    }
    if(up.startsWith("apple")){
      return SkipApple(up.substring(5));
    }else{
      return up.charAt(0)+SkipApple(up.substring(1));
    }
  }
  static String SkipAppNotApple(String up){
    if(up.isBlank()){
      return "";
    }
    if(up.startsWith("app") && !up.startsWith("apple")){
      return SkipAppNotApple(up.substring(3));
    }else{
      return up.charAt(0)+SkipAppNotApple(up.substring(1));
    }
  }
}