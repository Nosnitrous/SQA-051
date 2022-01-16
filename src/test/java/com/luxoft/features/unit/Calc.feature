Feature: Calculator

  Scenario: Divide
    Given numbers are
      | 10 |
      | 11 |
      | 12 |

  Scenario: 22 List List
    Given x divides y
      | 10 | 100 |
      | 11 | 110 |
      | 12 | 60  |

  Scenario: 33 Map
    Given x divides y Map
      | x  | y   |
      | 10 | 100 |
      | 11 | 110 |
      | 12 | 60  |

#  Scenario: 44 Map
#    Given x divides y Map2
#      | x  | y   |
#      | 10 | 100 |
#      | 11 | 110 |
#      | 12 | 60  |

  Scenario: 55 DataTable
    Given x divides y DataTable
      | x  | y   |
      | 10 | 100 |
      | 11 | 110 |
      | 12 | 60  |
