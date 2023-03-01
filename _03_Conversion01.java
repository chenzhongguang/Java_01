public class _03_Conversion01 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    // 自动类型转化
    double d = 20;
    System.out.println(d);

    //定义byte类型的变量
    byte b = 10;
    short s = b;
    int i = b;
    System.out.println(s);
    System.out.println(i);

    // 强制类型转换
    int k = (int)88.88;
    System.out.println(k);
  }
}
