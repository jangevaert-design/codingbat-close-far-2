public class CloseFar2 {
  public boolean closeFar(int a, int b, int c) {
    if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(c - b) >= 2) {
      return true;
    } else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(c - b) >= 2) {
      return true;
    } else {
      return false;
    }
  }
}
