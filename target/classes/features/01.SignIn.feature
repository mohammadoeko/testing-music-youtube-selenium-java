Feature: Sign In

  Scenario: TCC.SignIn.001 URL valid
    Given TCC.SignIn.001 open web music youtube in home page
    When TCC.SignIn.001 Click button sign in
    Then TCC.SignIn.001 Redirect to google login

  Scenario: TCC.SignIn.003 Input email invalid
    Given TCC.SignIn.003 Login page
    When TCC.SignIn.003 Input email invalid
    And TCC.SignIn.003 Click button next
    Then TCC.SignIn.003 Display notif Couldn’t find your Google Account

  Scenario: TCC.SignIn.004 Input email empty
    Given TCC.SignIn.004 Login page
    When TCC.SignIn.004 Input email empty
    And TCC.SignIn.004 Click button next
    Then TCC.SignIn.004 Display notif Enter an email or phone number

  Scenario: TCC.SignIn.005 Input email valid and password invalid
    Given TCC.SignIn.005 Login page
    When TCC.SignIn.005 Input email valid
    And TCC.SignIn.005 Click button next email
    And TCC.SignIn.005 Input password invalid
    And TCC.SignIn.005 Click button next password
    Then TCC.SignIn.005 Display notif Wrong password

  Scenario: TCC.SignIn.006 Input email valid and password empty
    Given TCC.SignIn.006 Login page
    When TCC.SignIn.006 Input email valid
    And TCC.SignIn.006 Click button next email
    And TCC.SignIn.006 Input password empty
    And TCC.SignIn.006 Click button next password
    Then TCC.SignIn.006 Display notif Enter a password

  Scenario: TCC.SignIn.002 Input email and password valid
    Given TCC.SignIn.002 Login page
    When TCC.SignIn.002 Input email valid
    And TCC.SignIn.002 Click button next email
    And TCC.SignIn.002 Input password valid
    And TCC.SignIn.002 Click button next password
    Then TCC.SignIn.002 Redirect to homepage user

