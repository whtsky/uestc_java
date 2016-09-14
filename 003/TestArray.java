import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int ary[] = new int[10];
        System.out.println("排序前：");
        for(int i = 0; i < 10; i++){
            ary[i] = (int)(100 * Math.random());
            System.out.print(ary[i] + "\t");
        }
        System.out.println("排序后：");
        Arrays.sort(ary);
        for(int i = 0; i < 10; i++){
            System.out.print(ary[i] + "\t");
        }
	}
}