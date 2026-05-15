class CircularQueue{
  int [] arr;
  int f ; int r; int size;

    public CircularQueue(int Size) {
      arr = new int [Size];
    }
    void add(int val){
      if(size==arr.length){
        System.out.println("Queue is FULL");
        return ;
      }
      arr[r++]= val;

      if(r == arr.length) r =0;
      size++;

    }

    int remove(){
      if(size ==0){
        System.out.println("Queue is EMPTY");
        
      }
      int frontVal = arr[f];
      f++;
      if(f==arr.length) f=0;
      size--;
      
      return frontVal;

    }
    int peek(){


      return arr[f];
    }

    void Display(){
      if(f>r){

      }else{
        for(int i =f;i<r;i++){
          System.err.print(arr[i]+" ");
        }
      }
    }
  
}

public class CircularArray {
  CircularQueue q = new CircularQueue(5);
  
}
