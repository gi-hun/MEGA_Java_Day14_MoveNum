/*
 * # 숫자이동[2단계]
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
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
					System.out.print("벽 ");
				}
				else if(game[i]==2)
				{
					System.out.print("나 ");
					check = i;
				}
				else
				{
					System.out.print(game[i]+" ");
				}
			}
			System.out.println();
			
			
			System.out.println("숫자 입력");
			int num = sc.nextInt();
			
			if(count==4 || count==-4)
			{
				System.out.println("더이상 움직임수 없습니디.");
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
			
			if(num == 1)		//왼쪽으로 이동
			{
				if(game[check-1] == 1)
				{
					System.out.println("벽을 만나 움직일 수 없습니다.");
					System.out.println("벽 부수기 -> 3");
				}
				else
				{
					game[check-1] = game[check];
					game[check] = 0;
					count++;
					System.out.println("count1 " + count);
				}
			}
			
			if(num == 2)		//왼쪽으로 이동
			{
				if(game[check+1] == 1)
				{
					System.out.println("벽을 만나 움직일 수 없습니다.");
					System.out.println("벽 부수기 -> 3");
				}
				else
				{
					game[check+1] = game[check];
					game[check] = 0;
					count--;
					System.out.println("count2 " + count);
				}
			}
			System.out.println("마지막:"+count);
		}
	}
}
