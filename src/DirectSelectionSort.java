import java.util.Arrays;

public class DirectSelectionSort {
    public static void main(String[] args) {
        int[] arr={2,5,0,1,7,6,9,4,3,8};
        System.out.println("排序前："+ Arrays.toString(arr));
        long startTime = System.currentTimeMillis();//记录排序开始时间
        DirectSelectionSort.directSort(arr);//堆排序
        long compeletedTime = System.currentTimeMillis();//记录排序结束时间
        System.out.println("共耗时"+(compeletedTime-startTime)+"毫秒");
        System.out.println("排序后："+Arrays.toString(arr));
    }

    private static void directSort(int[] arr) {
        //外循环控制轮数
        for (int i = 0; i < arr.length-1; i++) {
            //内循环控制比较次数
            int min=arr[i];//假设未排序元素中的"第一个"元素为最小值
            int index=i;//最小值对应的索引值

            for (int j = i+1; j < arr.length; j++) {//在i后查找小于i数
                if(arr[j]<min){
                   min=arr[j];
                   index=j;
                }
            }

            if(index!=i){//按顺序放置最小值
                //交换arr[index]与arr[i]
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }

        }
    }
}
