// public class test
// {
//   public static void main(String[] args)
//   {
//     // for(int i = 0;i < args.length; i++ )
//     // {
//     //   System.out.println(args[i]);
//     // }
    
//     //for-each 用于数组的输出
//     // for (String str : args)
//     // {
//     //   System.out.println(str);
//     // }


//     int x = 3;
//     print(x);
//   }
//   public static void print(int x)
//   {
//     if(x == 2)
//     {
//       return;
//     }
//     System.out.print(x);
//   }

// }


// public class test
// {
//   public static void main(String[] args)
//   {
//     print(10);
//     print('a');
//     print(10,20);
//   }
//   public static void print(int x)
//   {
//     System.out.print(x);
//   }
//   //方法重载——名称相同，类型不同
//   public static void print(char c)
//   {
//     System.out.print(c);
//   }
//   public static void print(int x,int y)
//   {
//     System.out.print(x + y);
//   }
// }

//方法递归
// public class test
// {
//   public static void main(String[] args)
//   {
//     System.out.print(getTotal(100));
//   }
//   public static int getTotal(int x)
//   {
//     if(x == 1)
//     {
//       return 1;
//     }
//     else
//     {
//       return x + getTotal(x-1);
//     }
//   }
// }



//for 循环打印乘法口诀表

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



// public class test
// {
//   public static void main(String[] args)
//   {
//     int[] data = new int[3];
//     data[0] = 10;
//     data[1] = 20;
//     // for(int i = 0;i < data.length; i++)
//     // {
//     //   System.out.print(data[i]+"、");
//     // }

//     //用for-each
//     for(int temp : data)
//     {
//       System.out.print(temp+"、");
//     }
//   } 
// }


// public class test
// {
//   public static void main(String[] args)
//   {
//     //data 为数组引用
//     int[] data = new int[3];
//     data[0] = 10;
//     data[1] = 20;
//     //引用传递
//     int x = data;
//     x[2] = 30;
//     System.out.print(data[3]);
//   }
// }


// public class test
// {
//   public static void main(String[] args)
//   {
//     //数组静态初始化
//     int[] data = new int[]{1,3,5,7,9,10};
//     System.out.print(data.length);
//     // data[6] = 11;//会产生数组越界！
//   }
// }

//二维数组的定义
// public class test
// {
//   public static void main(String[] args)
//   {
//     //静态初始化
//     int[][] data = new int[][]
//     {
//       {1,2,3},{4,5},{7,8,9,10}
//     };
//     for(int x = 0; x < data.length; x++)
//     {
//       for(int y = 0; y < data[x].length; y++)
//       {
//         System.out.print(data[x][y] + "、");
//       }
//     }
//   }
// }


//方法接收数组
public class test
{
  public static void main(String[] args)
  {
    int[] data = new int[]{2,4,6,8,10};
    //引用传递
    printArray(data);
  }
  public static void printArray(int[] data)
  {
    for(int temp : data)
    {
      System.out.print(temp+"、");
    }
  }
}

//方法返回数组
// public class test
// {
//   public static void main(String[] args)
//   {
//     int[] data = init();
//     printArray(data);
//   }
//   public static void printArray(int[] data)
//   {
//     for(int temp : data)
//     {
//       System.out.print(temp+"、");
//     }
//   }
//   public static int[] init()
//   {
//     return new int[]{2,4,6,8,10};
//   }
// }

//方法修改数组
// public class test
// {
//   public static void main(String[] args)
//   {
//     int[] data = init();
//     modify(data);
//     printArray(data);
//   }
//   public static void printArray(int[] data)
//   {
//     for(int temp : data)
//     {
//       System.out.print(temp+"、");
//     }
//   }
//   public static int[] init()
//   {
//     return new int[]{2,4,6,8,10};
//   }
//   public static void modify(int[] data)
//   {
//     data[3] = 5;
//   }
// }





