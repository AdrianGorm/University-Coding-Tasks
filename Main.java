class Main {
  public static void main(String[] args) {
    int p, q, r, s, t;
    
    p = 7;
    q = -4;
    r = (3 * p) + (4 * q);
    s = (5 * p) + (6 * r);

    if (r > s) {
        t = p + q + r;
    } else {
        t = p + q + s; 
    }
    
    System.out.println("P has the value: " + p);
    System.out.println("q has the value: " + q);
    System.out.println("r has the value: " + r);
    System.out.println("s has the value: " + s);
    System.out.println("t has the value: " + t);
  }
}