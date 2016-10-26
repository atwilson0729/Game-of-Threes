/*
 * Author: Andrew Wilson
 * Program: Game of Threes
 * Date: 10/25/2016
 * Description: This game generates a number, the either subtracts one or adds one then divides by 3 until it reaches 1
 */
import java.util.Scanner;
import java.util.Random;
public class Threes 
{
	public static void main (String [] args)
	{//no arguments main method to run
		//Create scanner object and random object
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		//generate very random number
		int n = rand.nextInt(2147483647) + 1;
		
		//show user the number starting with
		System.out.println("The starting number is: " + n);
		while (n != 1)
		{//loops until number has become 1
			if (n % 3 == 0)
			{//if it's divisible by 3
				//print the number and the change
				System.out.println(n + " " + 0);
				n /= 3;//divide number by 3
			}
			else
			{//if not divisible by 3
				if ((n + 1) % 3 == 0)
				{//if adding one makes it divisible by 3
					System.out.println(n + " " + 1);//print num and change
					n += 1;//add 1
					n /= 3;//divide by 3
				}
				else if ((n - 1) % 3 == 0)
				{//if subtracting one makes it divisible by 3
					System.out.println(n + " " + -1);//print num and change
					n -= 1;//subtract 1
					n /= 3;//divide by 3
				}
			}
		}
		System.out.println(n);//print last value of n (1)
		System.out.println("Complete.");//fin
		input.close();//close resources
	}
}
