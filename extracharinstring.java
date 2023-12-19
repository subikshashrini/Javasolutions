import java.util.*;
/*str1 and str2 are two strings.one string has all the letters of other
string with an extra letter,find the extra letter*/
//day 12-16/12/2023
public class extracharinstring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String strr1=scanner.nextLine();
        String str1=strr1.toLowerCase();
        String strr2=scanner.nextLine();
        String str2=strr2.toLowerCase();
        //tofind char count in str1
        int arr1[]=new int[26];
        for(char c:str1.toCharArray()){
            int index1=c -'a';
            arr1[index1]++;

        }
        int arr2[]=new int[26];
        for(char c:str2.toCharArray()){
            int index2=c -'a';
            arr2[index2]++;

        }

        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                System.out.println((char)(i+'a'));
            }
        }
    }
}
