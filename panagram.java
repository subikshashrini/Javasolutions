import java.util.*;
public class panagram{
    //Day-11 15/12/2023
    /*strings are said to be panagarm when they contain all the
    alphabets in english,not case sensitive*/

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        boolean is_panagram=true;//hello

        String str1 = str.toLowerCase();
        int a[] = new int[256];
        for(int i = 0; i < str1.length(); i++){
            a[str1.charAt(i)]++;
        }

        for(int i = 97; i < 123; i++){
            if(a[i] <1){
                is_panagram=false;
                break;
            }
        }
        if(is_panagram){
            System.out.print("PANAGRAM");

        }
        else {
            System.out.print("NOT PANAGRAM");

        }
  }
}
