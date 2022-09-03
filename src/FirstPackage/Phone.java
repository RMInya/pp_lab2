package firstpackage;

public class Phone {
  private int id = 1;
  private int nomer;
  private int localCall;
  private int distanceCall;
  private String name;

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public int getNomer() {
    return nomer;
  }

  public int getLocalCall() {
    return localCall;
  }

  public int getDistanceCall() {
    return distanceCall;
  }

  public void setDistanceCall(int dc) {
    this.distanceCall = dc;
  }

  public void setLocalCall(int lc) {
    this.localCall = lc;
  }

  public void setId(int i) {
    this.id = i;
  }

  public void setNomer(int n) {
    this.nomer = n;
  }

  public void setName(String nam) {
    this.name = nam;
  }

  public void output(Phone[] objArr, int len, int check) {
    for (int i = 0; i < len; i++) {
      if (check == i + 1) {
        System.out.println(objArr[i].getId());
        System.out.println(objArr[i].getName());
        System.out.println(objArr[i].getNomer());
        System.out.println(objArr[i].getLocalCall() + " minutes");
        System.out.println(objArr[i].getDistanceCall() + " minutes");
        System.out.println();
      }
    }
  }

  @Override
  public String toString() {
    return this.id + " " + this.name + " " + this.nomer + " " + this.localCall + " minutes " + this.distanceCall
        + " minutes";
  }
}