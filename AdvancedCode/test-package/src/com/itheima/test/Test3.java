

/*3.判断下面的代码的输出结果
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        method2(arr[1]);//3
        method1(arr); //1 10 3
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void method1(int[] brr) {
        brr[1] = 10;
    }

    public static void method2(int num) {
        num++;
    }

}
输出结果为:
    1
    10
    3
*/

