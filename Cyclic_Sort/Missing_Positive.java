// Given an unsorted integer array nums, return the smallest missing positive intiger

public class Missing_Positive {
    public static void main(String[] args) {
        int num []={0,1,4,3,5};
        System.out.println(sort(num));
        
        
    }
    static int sort(int num[]){
        int i =0;
        while(i<num.length){
            int correct=num[i]-1;
            if(num[i] > 0 && num[i]!=num[correct] && num[i]<=num.length){
                swap(num, i, correct);
            }else{
                i++;
            }
            
        }
        for(int index =0;index<num.length;index++){
            if(num[index]!=index+1){
                return index+1;
            }
        }
        return num.length+1;
    }
    static void swap(int [] num,int start,int second){
        int temp =num[start];
        num[start]=num[second];
        num[second]=temp;
    }
    
}
