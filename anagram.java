import java.util.*;
 class anagram {
     //Day-11 17/12/2023---ANAGRAM
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean is_anagram=true;
        String str1=scanner.nextLine();
        String compare_str1=str1.toLowerCase();
        String str2=scanner.nextLine();
        String compare_str2=str2.toLowerCase();
        int[] arr1=new int[26];
        for(char c:str1.toCharArray()){
            int index1=c -'a';
            arr1[index1]++;
        }

        int[] arr2=new int[26];
        for(char c:str2.toCharArray()){
            int index2=c -'a';
            arr2[index2]++;
        }


        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                is_anagram=false;
                break;
            }
        }

        if(is_anagram){
            System.out.println("ANAGRAM");
        }
        else{
            System.out.println("NOT ANAGRAM");

        }

    }
}

