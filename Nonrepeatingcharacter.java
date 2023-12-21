import java.util.Scanner;
public class Nonrepeatingcharacter
{

    /*return the 1st non repeating characrter in S
    if no nonrepeating character return '$'
    input: hello output: h*/
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();// hello
        int[] arr=new int[26];
        int index;
        char nonrepeatingchar='$';
        for(char c:str.toCharArray())
        {
            index= c - 'a';
            arr[index]++;
       }
        for(char c:str.toCharArray())
        {
            index = c -'a';
            if(arr[index]==1)
            {
                nonrepeatingchar = c;
                break;
            }
        }
        System.out.println(nonrepeatingchar);


    }
}
