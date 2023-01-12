Feature: paralel Execution

  Scenario Outline:
    Given Thread id yi yazdir

    Examples:
      | a |
      | 1 |
      | 2 |
      | 3 |
      | 4 |
      | 5 |

  Scenario:
    Given Thread id yi yazdir

  Scenario:
    Given Thread id yi yazdir