// //for 循环打印乘法口诀表

// public class test
// {
//   public static void main(String[] args)
//   {
//     for(int i = 1;i <= 9; i++)
//     {
//       for(int j = 1; j <= i; j++)
//       {
//         System.out.print(i + "*" + j + "=" + (i * j) + "  ");
//       }
//       System.out.print("\n");//这里 \n用来回车
//     }
//   }
// }

// // 实现N的阶乘
// // public static void main(String[] args) {
// //         System.out.print(jieCheng(20));
// //     }
// //     public static long jieCheng(int i) {
// //         if(i == 1) {
// //             return 1L;
// //         }else {
// //             return i * jieCheng(i-1);
// //         }
// //     }


// //Java数组章节练习题
// public class ArrayUtils{

//     //1.计算数组中最大值
//     public static int arrayMaxElement(int[] data){
//         // 哨兵思想
//         int max = data[0];
//         for(int i = 0;i < data.length;i++) {
//             if(data[i] > max) {
//                 max = data[i];
//             }
//         }
//         return max;
//     }
    
//     //2.计算数组中最小值
//     public static int arrayMinElement(int[] data){
//         // 哨兵思想
//         int min = data[0];
//         for(int i = 0;i < data.length;i++) {
//             if(data[i] < min) {
//                 min = data[i];
//             }
//         }
//         return min;
//     }
    
    
//     //3.计算数组值之和
//     public static int arrayElementSum(int[] data){
//         int result = 0;
//         for(int i = 0;i < data.length;i++) {
//             result += data[i];
//         }
//         return result;
//     }
    
//     //4.数组拼接
//     // [1,3,5,7,9] [2,4,6,8,10] [1,3,5,7,9,2,4,6,8,10]
//     public static int[] arrayJoin(int[] a, int[] b){
//         int[] result = new int[a.length+b.length];
//         for(int i = 0;i < a.length;i++) {
//             result[i] = a[i];
//         }
//         for(int i = 0;i < b.length;i++) {
//             result[a.length+i] = b[i];
//         }
//         return result;
//     }

//     //5.数组截取
//     //[start, end)
//     // [1,3,5,7,9] 1,4 -> 3,5,7
//     public static int[] arraySub(int[] data, int start , int end){
//         int[] result = new int[end - start];
//         int flag = 0;
//         for(int i = start;i < end;i++) {
//             result[flag] = data[i];
//             flag++;
//         }
//         return result;
//     }
    
//     //6.数组打印
//     public static void printArray(int[] data){
//         for(int i : data) {
//             System.out.print(i+"、");
//         }
//     }
    
//     //7.数组反转
//     // 比如：[1,2,3,4] => [4,3,2,1]
//     public static void printReversal(int[] data){
//         for(int i = data.length-1;i >= 0;i--) {
//             System.out.print(data[i]+"、");
//         }
//     }
    
//     public static void main(String[] args){
//         int[] A = new int[]{1,3,5,7,9};
//         printReversal(A);       
//     }
// }

