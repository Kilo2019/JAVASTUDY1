public class ArrayDemo2 {
    public static void main(String[] args){
        //二维数组的使用
        int a[][] = new int[2][];
        a[0] = new int[2];
        a[0][0] =1;
        a[0][1] =3;
        a[1] = new int[] {2,4,6,8};
        for(int i = 0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
                System.out.println("a["+i+"]["+j+"]="+a[i][j]);//输出数据
        }
        System.out.println("---------------------------------------");
        int b[][] ={{1,2,3,},{8,9,10,11,12}};
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.println("b["+i+"]["+j+"]="+b[i][j]+" ");
            }
        }
        System.out.println("---------------------------------------");
    }
}
