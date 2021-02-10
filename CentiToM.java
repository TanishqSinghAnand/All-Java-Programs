public class CentiToM {
  void cenToM(long cm) {

    long m = cm / 1000;
    double cem = cm % 1000;
    System.out.println("Number of meters are " + m);
    System.out.println("Number of centimeters are " + cem);

  }
}
