import java.util.Scanner;
public class ValidateanIP {
 /*A valid IPv4 Address is of the form x1.x2.x3.x4
 where 0 <= (x1, x2, x3, x4) <= 255.
 Thus, we can write the generalized form of an IPv4 address
 as (0-255).(0-255).(0-255).(0-255).
 Note: Here we are considering numbers only from 0 to 255
  and any additional leading zeroes will be considered invalid.
  DAY--20/12/2023 VALIDATE AN IP
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterIP=scanner.nextLine();
        boolean isvalidate_ip= true;
        String[] splitedarr=enterIP.split("\\.");
        if(splitedarr.length!=4)
        {
            isvalidate_ip=false;
        }
        else
        {
            for (int i = 0; i < splitedarr.length; i++)
            {
                int value = Integer.parseInt(splitedarr[i]);
                if (!(value >= 0 && value <= 255))
                {
                    isvalidate_ip = false;
                    break;
                }
            }
        }
         if(isvalidate_ip)
         {
             System.out.println("Valid IP address");
         }
         else
         {
             System.out.println("Invalid IP address");
         }
    }

}

