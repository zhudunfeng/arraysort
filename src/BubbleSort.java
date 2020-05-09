import sun.jvm.hotspot.code.BufferBlob;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,5,0,1,7,6,9,4,3,8};
        System.out.println("排序前："+ Arrays.toString(arr));
        long startTime = System.currentTimeMillis();//记录排序开始时间
//        Date date = new Date(startTime);
//        System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(date).toString());
        BubbleSort.bubbleSort(arr);//堆排序
        long compeletedTime = System.currentTimeMillis();//记录排序结束时间
        System.out.println("共耗时"+(compeletedTime-startTime)+"毫秒");
        System.out.println("排序后："+Arrays.toString(arr));
    }

    /**
     * 冒泡排序算法实现
     * @param arr
     */
    private static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {//外层控制循环次数 10
            for (int j = 0; j < arr.length-i; j++) {//内循环控制每一轮比较的次数
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
