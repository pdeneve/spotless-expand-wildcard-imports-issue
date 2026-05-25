package two;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class TwoTest {

  @Test
  void isCreated() {
    var two = TwoTestBuilder.build();
    assertNotNull(two.date());
  }
}
