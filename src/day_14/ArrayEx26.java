/*
 * # �����̵�[2�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 */
package day_14;

import java.util.Scanner;

public class ArrayEx26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		int check = 0;
		int count = 0;
		
		while(true)
		{
			for(int i=0;i<9;i++)
			{
				if(game[i]==1)
				{
					System.out.print("�� ");
				}
				else if(game[i]==2)
				{
					System.out.print("�� ");
					check = i;
				}
				else
				{
					System.out.print(game[i]+" ");
				}
			}
			System.out.println();
			
			
			System.out.println("���� �Է�");
			int num = sc.nextInt();
			
			if(count==4 || count==-4)
			{
				System.out.println("���̻� �����Ӽ� �����ϵ�.");
				break;
			}
			
			if(num == 3)
			{
				game[check-1] = 0;
				game[check+1] = 0;
			}
			else if(num != 3)
			{
				continue;
			}
			
			if(num == 1)		//�������� �̵�
			{
				if(game[check-1] == 1)
				{
					System.out.println("���� ���� ������ �� �����ϴ�.");
					System.out.println("�� �μ��� -> 3");
				}
				else
				{
					game[check-1] = game[check];
					game[check] = 0;
					count++;
					System.out.println("count1 " + count);
				}
			}
			
			if(num == 2)		//�������� �̵�
			{
				if(game[check+1] == 1)
				{
					System.out.println("���� ���� ������ �� �����ϴ�.");
					System.out.println("�� �μ��� -> 3");
				}
				else
				{
					game[check+1] = game[check];
					game[check] = 0;
					count--;
					System.out.println("count2 " + count);
				}
			}
			System.out.println("������:"+count);
		}
	}
}
