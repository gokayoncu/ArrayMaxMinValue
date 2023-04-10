import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Project {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];
        int a;

        Scanner input=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        a= input.nextInt();
        Arrays.sort(list);
        for (int i : list){
            if (i<a){
                min=i;
            }
            if (i>a){
                max=i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
