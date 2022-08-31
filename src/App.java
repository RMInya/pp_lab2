import java.util.*;
import FirstPackage.Phone;

public class App {
  int len;

  public void input(Phone[] objArr) {
    int nomer, localCall, distanceCall;
    String name;
    for (int i = 0; i < len; i++) {
      objArr[i] = new Phone();
    }
    for (int i = 0; i < len; i++) {
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
  }

  public void IsA(Phone[] objArr) {
    int lenOfConversation;
    Scanner nu = new Scanner(System.in);
    System.out.println("set the time of the conversations: ");
    lenOfConversation = nu.nextInt();
    System.out.println();
    System.out.println("Users whose local calls time more than set");
    System.out.println();
    for (int i = 0; i < len; i++) {
      int temp = 0;
      temp = objArr[i].getLocalCall();
      if (temp > lenOfConversation) {
        int check = i + 1;
        objArr[i].toString(objArr, len, check);
      }
    }
  }

  public void IsB(Phone[] objArr) {
    System.out.println();
    System.out.println("Users who had a distance calls");
    System.out.println();
    for (int i = 0; i < len; i++) {
      int temp = 0;
      temp = objArr[i].getDistanceCall();
      if (temp > 0) {
        int check = i + 1;
        objArr[i].toString(objArr, len, check);
      }
    }
  }

  public void IsC(Phone[] objArr) {
    int Minimum = 0, Maximum = 0;
    Scanner nu = new Scanner(System.in);
    System.out.println("set diapason(minimum  maximum): ");
    Minimum = nu.nextInt();
    Maximum = nu.nextInt();
    System.out.println();
    System.out.println("Users whose numbers is in set diapason");
    System.out.println();
    for (int i = 0; i < len; i++) {
      int temp = 0;
      temp = objArr[i].getNomer();
      if (temp >= Minimum) {
        if (temp <= Maximum) {
          int check = i + 1;
          objArr[i].toString(objArr, len, check);
        }
      }
    }
  }

  public static void main(String[] args) {
    App objPhone = new App();
    Scanner nu = new Scanner(System.in);
    System.out.println("Enter how many phones you have");
    objPhone.len = nu.nextInt();
    System.out.println();
    Phone[] objArr = new Phone[objPhone.len];
    objPhone.input(objArr);
    objPhone.IsA(objArr);
    objPhone.IsB(objArr);
    objPhone.IsC(objArr);
  }
}
