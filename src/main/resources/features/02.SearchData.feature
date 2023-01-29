Feature: Search Data
  Scenario: TCC.Search.001 Input search data and click enter
    Given TCC.Search.001 open web music youtube
    When TCC.Search.001 click search menu
    And TCC.Search.001 type sugeng dalu
    And TCC.Search.001 click enter
    Then TCC.Search.001 display result data sugeng dalu

  Scenario: TCC.Search.002 Input does not match search data and click enter
    Given TCC.Search.002 open web music youtube
    When TCC.Search.002 click search menu
    And TCC.Search.002 type kulpsihfkshp
    And TCC.Search.002 click enter
    Then TCC.Search.002 display no result found in the web

  Scenario: TCC.Search.003 Input empty search data
    Given TCC.Search.003 open web music youtube
    When TCC.Search.003 click search menu
    And TCC.Search.003 type empty in search
    And TCC.Search.003 click enter
    Then TCC.Search.003 stay in search menu