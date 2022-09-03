import java.util.*;
import firstpackage.Phone;

public class App {

  public static Phone[] input(int length) {
 
    int nomer, localCall, distanceCall;
    String name;
    Phone[] objArr = new Phone[length];

    for (int i = 0; i < length; i++) {
      objArr[i] = new Phone();
    }
    for (int i = 0; i < length; i++) {
      Scanner n = new Scanner(System.in);
      System.out.println("Enter name of phone " + (i + 1));
      name = n.nextLine();
      objArr[i].setName(name);
      System.out.println();
      Scanner no = new Scanner(System.in);
      System.out.println("Enter nomer of phone " + (i + 1));
      nomer = no.nextInt();
      objArr[i].setNomer(nomer);
      System.out.println();
      Scanner lc = new Scanner(System.in);
      System.out.println("Enter how many minutes of local calls were ");
      localCall = lc.nextInt();
      objArr[i].setLocalCall(localCall);
      System.out.println();
      Scanner dc = new Scanner(System.in);
      System.out.println("Enter how many minutes of distance calls were ");
      distanceCall = dc.nextInt();
      objArr[i].setDistanceCall(distanceCall);
      System.out.println();
      objArr[i].setId((i + 1));
    }
    return objArr;
  }
  public static void isA(Phone[] phone) {
    int lenOfConversation;
    Scanner nu = new Scanner(System.in);
    System.out.println("set the time of the conversations: ");
    lenOfConversation = nu.nextInt();
    System.out.println();
    System.out.println("Users whose local calls time more than set");
    System.out.println();
    for (int i = 0; i < phone.length; i++) {
      int temp = 0;
      temp = phone[i].getLocalCall();
      if (temp > lenOfConversation) {
        int check = i + 1;
        phone[i].output(phone, phone.length, check);
      }
    }
  }

  public static void isB(Phone[] objArr) {

    System.out.println();
    System.out.println("Users who had a distance calls");
    System.out.println();
    for (int i = 0; i < objArr.length; i++) {
      int temp = 0;
      temp = objArr[i].getDistanceCall();
      if (temp > 0) {
        int check = i + 1;
        objArr[i].output(objArr, objArr.length, check);
      }
    }
  }

  public static void isC(Phone[] objArr) {


    int Minimum = 0, Maximum = 0;
    Scanner nu = new Scanner(System.in);
    System.out.println("set diapason(minimum  maximum): ");
    Minimum = nu.nextInt();
    Maximum = nu.nextInt();
    System.out.println();
    System.out.println("Users whose numbers is in set diapason");
    System.out.println();
    for (int i = 0; i < objArr.length; i++) {
      int temp = 0;
      temp = objArr[i].getNomer();
      if (temp >= Minimum) {
        if (temp <= Maximum) {
          int check = i + 1;
          objArr[i].output(objArr, objArr.length, check);
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner nu = new Scanner(System.in);
    System.out.println("Enter how many phones you have");
    int length = nu.nextInt();
    System.out.println();
    Phone[] objArr = input(length);
    isA(objArr);
    isB(objArr);
    isC(objArr);
  }
}
