
import java.util.Arrays;

// Sure! Here are some **basic and useful Bubble Sort questions** that will help you understand the **concept, logic, and variations** of Bubble Sort clearly. I'll also include a mix of **dry run, output-based, logic-based**, and **code error-finding** questions:

// ---

// ### 🔁 **Concept & Understanding Questions**

// 1. **What is Bubble Sort and how does it work?**
// 2. **What is the time complexity of Bubble Sort in best, worst, and average cases?**
// 3. **Why is it called "Bubble" Sort?**
// 4. **How can we optimize Bubble Sort to reduce unnecessary passes?**
// 5. **Can Bubble Sort be used for sorting in descending order? How?**

// ---

// ### 📋 **Dry Run Questions**

// 6. Dry run this array with Bubble Sort:

//    * Input: `[5, 1, 4, 2, 8]`
//    * Show how the array changes in each pass.

// 7. Dry run with an already sorted array:

//    * Input: `[1, 2, 3, 4, 5]`
//    * How many comparisons will happen?

// ---

// ### 🧠 **Logic and Output Questions**

// 8. What will be the output of the following Java code?

//    ```java
//    int[] arr = {3, 2, 1};
//    bubbleSort(arr);
//    System.out.println(Arrays.toString(arr));
//    ```

// 9. Modify Bubble Sort to **print the array after each pass**.

// 10. How do you check in code if the array is already sorted in one pass?

// ---

// ### 🛠️ **Code Correction / Debugging Questions**

// 11. What is wrong in this bubble sort code?

// ```java
// for (int i = 0; i < arr.length; i++) {
//     for (int j = 1; j <= arr.length - i; j++) {
//         if (arr[j] < arr[j - 1]) {
//             // swap
//         }
//     }
// }
// ```

// 12. Why might this code give `ArrayIndexOutOfBoundsException`?

// ---

// ### 🧪 **Practical Coding Tasks**

// 13. Write a Bubble Sort function to sort an array in **descending** order.

// 14. Modify Bubble Sort to **count the number of swaps** made.

// 15. Given an array, use Bubble Sort to find the **second largest element**.

// 16. Modify Bubble Sort to sort only the **first half** of the array.

// ---

// Would you like me to provide answers or dry run examples for any of these questions?


public class Ques_01 {
    public static void main(String[] args) {
        int arr[]={3,2,1};
        Sort(arr);
        System.out.println(Arrays.toString(arr));

        
    }

    static void Sort(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    
}
