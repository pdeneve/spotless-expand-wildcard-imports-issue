package one;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class OneTest {

  @Test
  void isCreated() {
    var one = OneTestBuilder.build();
    assertNotNull(one.x());
    assertNotNull(one.y());
  }
}
