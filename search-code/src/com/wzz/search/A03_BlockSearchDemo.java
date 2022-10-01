package com.wzz.search;

public class A03_BlockSearchDemo {
    public static void main(String[] args) {
        /*分块查找
         * 核心思想：块内无序，块间有序
         * 实现步骤：
         * 1、创建数组blockArr存放每一个块对象的信息；
         * 2、先查找blockArr确定要查找的数据属于哪一块；
         * 3、再单独遍历这一块数据即可。
         * */
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        //要把数据进行分块
        //要分为几块：18开根号，4.24块
        //创建3个块的对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        //定义数组用来管理3个块的对象（索引表）
        Block[] blocksArr = {b1, b2, b3};

        //定义一个变量用来记录要查找的元素
        int number = 61;

        //调用方法，传递索引表、数组、要查找的元素
        int index = getIndex(blocksArr, arr, number);
        System.out.println(index);

    }

    //利用分块查找的原理，查询number的索引
    private static int getIndex(Block[] blocksArr, int[] arr, int number) {
        //1、确定number是在那一块当中
        int indexBlock = findIndexBlock(blocksArr, number);

        if (indexBlock == -1) {
            //表示number不在数组当中
            return -1;
        }

        //2、获取这一块的超始索引和结束索引
        int startIndex = blocksArr[indexBlock].getStartIndex();
        int endIndex = blocksArr[indexBlock].getEndIndex();

        //3、遍历
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }

        return -1;
    }

    //定义一个方法，用来确定number在哪一块当中
    public static int findIndexBlock(Block[] blocksArr, int number) {//怎么确定30在和2块当中？
        //Block b1 = new Block(21, 0, 5);   0
        //Block b2 = new Block(45, 6, 11);  1
        //Block b3 = new Block(73, 12, 17); 2

        //从0索引开始遍历blockArr，如果number小于max,那么就表示number是在这一块当中的
        for (int i = 0; i < blocksArr.length; i++) {
            if (number <= blocksArr[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}


class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}