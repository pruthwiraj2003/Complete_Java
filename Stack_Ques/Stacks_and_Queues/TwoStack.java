import java.util.*;

public class TwoStack {
  static int twoStacks(int x, int[]a,int[]b ){

    return twoStacks(x,a,b,0,0);
  }
  private static int twoStacks(int x,int[]a,int[]b,int sum,int count){
      if(sum>x){
        return count-1;
      }
      if(a.length==0||b.length==0){
        return count;
      }
      int ans1 = twoStacks(x,Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
      int ans2 = twoStacks(x,a,Arrays.copyOfRange(b,1,a.length),sum+a[0],count+1);

      return Math.max(ans1,ans2);
  }
}
