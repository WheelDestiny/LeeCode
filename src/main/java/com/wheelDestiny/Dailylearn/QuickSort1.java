package com.wheelDestiny.Dailylearn;

public class QuickSort1 {
    public static void main(String[] args) {
        int maxSize = 200000;
        ArrayIns arrayIns;
        arrayIns = new ArrayIns(maxSize);
        for (int i = 0; i < maxSize; i++) {
            long n = (int)(Math.random()*99);
            arrayIns.insert(n);
        }
//        arrayIns.display();
        long startTime=System.currentTimeMillis();
        arrayIns.quickSort();
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
//        arrayIns.display();
    }
}
class ArrayIns{
    private long[] theArray;
    private int nElems;

    public ArrayIns(int max){
        theArray = new long[max];
        nElems = 0;
    }
    public void insert(long value){
        theArray[nElems] = value;
        nElems++;
    }
    public void display(){
        System.out.print("A=");
        for (int i = 0; i <nElems ; i++) {
            System.out.print(theArray[i] +" ");
        }
        System.out.println();
    }

    /**
     *
     * 快速排序的核心思路就在于划分，选择一个枢纽，将数组根据枢纽划分到两侧，并对子数组递归的调用排序方法达到排序的目的
     *
     * 三个基本步骤
     * 1，把数组或者子数组划分成左侧(小于枢纽)的一组，右侧(大于枢纽)的一组。
     * 2，调用自身方法对左侧子数组进行排序
     * 3，调用自身方法对右侧子数组进行排序
     *
     * 在每次划分完成后，将枢纽放在左右数组的分界位置，该位置即为枢纽在完全有序数组中应该在的位置。
     *
     */
    public void quickSort(){
        recQuickSort(0,nElems-1);
    }
    //排序方法
    public void recQuickSort(int left,int right){
        if(right-left<=0){
            return;
        }else {
            //设定枢纽为数组的最右端的元素
            long pivot = theArray[right];

            //将数组按照pivot的值划分为左右两个数组，大于pivot的在左边，小于pivot的在右边
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left,partition-1);
            recQuickSort(partition+1,right);

        }
    }
    //划分方法
    public int partitionIt(int left,int right,long pivot){
        int leftPtr = left-1;
        int rightPrt = right;
        while (true){
            //循环左侧数组，从左到右，如果大于枢纽，则停顿，记录当前位置，等待交换
            while (theArray[++leftPtr]<pivot){
                ;
            }
            //循环右侧数组，从右到左，如果小于枢纽，则停顿，记录当前位置，等待交换
            while (rightPrt>0&&theArray[--rightPrt]<pivot){
                ;
            }
            //当左右标记交汇时跳出循环，当前次排序结束
            if (leftPtr>=rightPrt){
                break;
            }else {
                swap(leftPtr,rightPrt);
            }
        }
        //划分结束
        //交换枢纽和左侧数组的最后一位，将枢纽移动到应该在的位置。
        swap(leftPtr,right);
        //返回枢纽所在的位置
        return leftPtr;
    }
    //交换数组中的两个值
    public void swap(int dex1,int dex2){
        long temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }
}
