package one;

import java.util.Random;

public class OneTestBuilder {

  private static Random random = new Random();

  public static One build() {
    return new One(random.nextInt(), random.nextInt());
  }
}
