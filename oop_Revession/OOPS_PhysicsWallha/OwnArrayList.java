class ArrayList{
  int [] arr ;
  int idx =0;
  int size = 0;
    ArrayList(int capacity){
      arr = new int[capacity];
    }
    void remove(int index){
      if(index < 0 || index>=size){
        System.out.println("Invalid index");
      }
      for(int i =0;i<size-1;i++){
        arr[i] = arr[i+1];
      }
      size --;
      idx--;
    }
  void add(int ele){
    if(idx == arr.length){
      int [] arr2 = new int[arr.length*2];
      for(int i =0;i<arr.length;i++){
        arr2[i] = arr[i];
      }
      arr = arr2;
    }
    arr[idx++] = ele;
    size++;
  }
  int capacity(){

    return arr.length;
  }
  int get(int index){

    return arr[index];
  }
  void dispaly(){
    for(int i =0; i< size-1;i++){
      System.out.println(arr[i]+" ");
    }
  }

}
public class OwnArrayList {
  public static void main(String[] args) {
    ArrayList arr = new ArrayList(3);
    arr.add(10);arr.add(20);arr.add(30);
    // System.out.println(arr.size);
    // arr.dispaly();
    // System.out.println(arr.get(1));
    arr.add(34);
    arr.dispaly();
    arr.remove(3);
    arr.dispaly();
  }
  
}
