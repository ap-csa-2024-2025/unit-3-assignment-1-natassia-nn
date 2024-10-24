import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle r1 = new rectangle(2, 4);
    Rectangle r2 = new rectangle(4, 6);
    boolean isRotated = (r1.getLength() = r2.getWidth()) && (r2.getLength() = r1.getWidth());
    boolean isCongruent = ((r1.equals(r2)) || isRotated);
    boolean isSimilar = (isCongruent || (r1.getLength() / r2.getLength()) == (r1.getWidth() / r2.getWidth()))

  }
}
