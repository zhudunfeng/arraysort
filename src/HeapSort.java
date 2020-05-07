import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr={2,5,0,1,7,6,9,4,3,8};
        System.out.println("排序前："+ Arrays.toString(arr));
        long startTime = System.currentTimeMillis();//记录排序开始时间
        HeapSort.heapSort(arr);//堆排序
        long compeletedTime = System.currentTimeMillis();//记录排序结束时间
        System.out.println("共耗时"+(compeletedTime-startTime)+"毫秒");
        System.out.println("排序后："+Arrays.toString(arr));

    }

    /**
     * 实现堆排序
     * @param arr
     */
    private static void heapSort(int[] arr) {
        int len = arr.length;

        //循环建堆
        for (int i = 0; i <len-1 ; i++) {
            //建大根堆
            buildMaxHeap(arr,len-1-i);
            //交换堆顶和最后一个元素
            swap(arr,0,len-1-i);
        }
    }


    /**
     * 交换堆顶和最后一个元素
     * @param data
     * @param i
     * @param j
     */
    private static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i]=data[j];
        data[j]=tmp;
    }

    /**
     *  建大顶堆
     * @param data
     * @param lastIndex
     */
    private static void buildMaxHeap(int[] data, int lastIndex) {
        //从lastIndex处节点（最后一个节点）的父节点开始
        for (int i = (lastIndex-1)/2; i >=0 ; i--) {
            //k保存正在判断的节点
            int k=i;
            //如果当前的k节点的子节点存在
            while (k*2+1<=lastIndex){
                //k节点的左子节点的索引
                int biggerIndex=2*k+1;
                //如果biggerIndex小于lastIndex
                //即biggerIndex+1代表的k节点的右子节点存在
                if (biggerIndex <lastIndex) {
                    //如果右子节点值较大
                    if (data[biggerIndex]<data[biggerIndex+1]) {
                        //biggerIndex总是记录最大
                        //子节点的索引
                        biggerIndex++;
                    }
                }
                //如果k节点的值小于其较大的子节点的值
                if(data[k]<data[biggerIndex]){
                    //交换他们
                    swap(data, k, biggerIndex);
                    //将biggerIndex赋予k，开始
                    //while循环的下一次循环
                    //重新保证k节点的值大于其左右子节点的值
                    k=biggerIndex;
                }else {
                    break;
                }
            }
        }
    }

}
