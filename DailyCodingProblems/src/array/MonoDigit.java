package array;

/**
 * Write a program to convert a number into a mono-digit number. Conditions: a)
 * You are allowed to add and subtract the consecutive digits (starting from
 * left). b) You are allowed to do only one operation on a digit. c) You cannot
 * perform any operation on a resultant digit of the previous operation. d) Your
 * code should also find if a given number cannot be converted to a mono digit
 * number. Input Output 72581 7(2+5)81 77(8-1) 777 3962 cannot create a mono
 * digit number
 * https://wisdomoverflow.com/2019/01/18/to-check-whether-the-given-number-is-mono-digit-or-not/
 */



/*Other resource
 * #include<stdio.h>
int main()
{
    int i,j=0,b[20],k=0,c[20],m=1,n=0,l=0;
    char a[20];
    printf("enter the number:");
    gets(a);                     //get the input as a string
    i=strlen(a);                 //length of string
    while(a[j]!='\0')            //convert the string to integer
    {
        b[j]=a[j]-48;            //stores converted value into integer array
        j++;
    }
    for(k=0;k<3;k++)             //check three possibilities
    {
        if(k==0)                 //checks with first element
        {
            c[0]=b[0];
            m=1,n=0;
        }
        else if(k==2)           //checks with addition of first and second element
        {
            c[0]=b[0]+b[1];
            m=2,n=0;
        }
        else                   //checks with subtraction of first and second element
        {
            c[0]=b[0]-b[1];
            m=2,n=0;
        }
        check:                 //check is the label
        for(j=m;j<i;j++)
        {
            n++; //increments the monodigit array position
            if(c[0]==b[j]) //single digit is equal to c[0]
            {
                c[n]=b[j]; //store the monodigit value into array
                m=j+1; //increments the index by one 
                goto check;
            }
            else if(c[0]==b[j]+b[j+1]) //addition of two consecutive are equal to c[0]
            {
                c[n]=b[j]+b[j+1];
                m=j+2;
                goto check;
            }
            else if(c[0]==b[j]-b[j+1]) //subtraction of two consecutive are equal to c[0]
            {
                c[n]=b[j]-b[j+1];
                m=j+2;
                goto check;
            }
            else //breaks from loop when all conditions fails
            {
                l++;
                break;
            }
        }
        if(m>i-1)                     //prints the monodigit
        {
            printf("\nGiven number is monodigit:");
            for(j=0;j<n+1;j++)
            {
                printf("%d ",c[j]);
            }
        }
    }
    if(l==3)                         //prints when three possibilities fails
    {
        printf("It is not monodigit");
    }
    return 0;
}
 * */


public class MonoDigit {
/*Need to improvise solution in future
 * Test case
 * 
 * 123
23232323232323
7734716752
12345678

Output:
YES
YES
YES
NO
 * */
	public static void main(String[] args) {

		long n = 11;
		if (n <= 9) {
			System.out.print(n + "is mono digit");
		} else {
			int[] digits = Long.toString(n).chars().map(c -> c - '0').toArray();
			// System.out.println(Arrays.toString(digits));
			System.out.print(n);
			findMonoDigit(digits);
		}
	}

	private static void findMonoDigit(int[] a) {
		int s[] = new int[3];
		s[0] = a[0];
		s[1] = a[0] + a[1];
		s[2] = (a[0] - a[1] < 0) ? 0 : a[0] - a[1];
		if (checkAllDigits(a)) {
			System.out.println(" is a Mono digit");
			return;
		}
		boolean flag = false;
		for (int i = 2; i < a.length - 1;) {
			if ((checkPossibility(a[i], s) == true)) {

				i++;
				flag = true;
			} else if (checkPossibility(a[i], a[i + 1], s)) {
				i = i + 2;
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		if (flag == true)
			System.out.println(" is a Mono digit");
		else
			System.out.println(" is not a Mono digit");

	}

	private static boolean checkPossibility(int i, int j, int[] s) {
		int add = i + j, sub = i - j;

		for (int k = 0; k < s.length; k++)
			if (s[k] == add || s[k] == sub)
				return true;

		return false;
	}

	private static boolean checkPossibility(int i, int[] s) {
		for (int j = 0; j < s.length; j++)
			if (s[j] == i)
				return true;

		return false;
	}

	private static boolean checkAllDigits(int[] arr) {
		int k = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (k != arr[i])
				return false;

		return true;
	}

}
