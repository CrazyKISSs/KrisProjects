package module4.beenarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BeenarySearch {
    static  int proverka = 0;
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("������� ���������� ����� ��� ������: ");
        int n = text.nextInt();
        int[] array = new int[n];
        System.out.println("������� " + n + " ����� �����: ");
        for (int i = 0; i < n; i++)
            array[i] = text.nextInt();
        Arrays.sort(array);
        System.out.println("������� ����� ������������� � ������� �����������: \n" +  Arrays.toString(array));
        System.out.println("������� �����, ������ ����� �����: ");
        int item = text.nextInt();
        int min = 0;
        int max = n;
        while (min <=max) {
            int mid = (min + max) / 2;
            if (array[mid] == item) {
                proverka = 1;
                System.out.println("������� ����� �� " + (mid + 1) + " �����.");
            }
            if (array[mid] > item)
                max = mid - 1;
            else
                min = mid + 1;
        }
        if (proverka == 0)
            System.out.println("����� " + item + " ��� ����� �������������� �����");
    }
}
