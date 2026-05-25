package two;

import java.time.LocalDate;

public class TwoTestBuilder {

  public static Two build() {
    return new Two(LocalDate.now());
  }
}
