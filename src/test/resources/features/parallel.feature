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

  Scenario: Scanerio 1
    Given Thread id yi yazdir

  Scenario:Scanerio 2
    Given Thread id yi yazdir