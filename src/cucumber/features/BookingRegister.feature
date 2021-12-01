Feature: Booking register

  Scenario Outline: user can create an account
    Given an open browser with HotelTestlabCoderslab
    When the form is filled with email <eMail> first name <firstName> last name <lastName> password <password>
    Then the webpage should contain 'Welcome to your account. Here you can manage all of your personal information and orders.'
    And close the browser

    Examples:
    |eMail                  |firstName |lastName|password |
    |helena.kowalska12@op.pl|Helena    |Kowalska|akslawok |
    |olek.nowak312@gmail.com|Aleksander|Nowak   |kawonkelO|
    |joanna.parnas12@ukr.net|Joanna    |Parnas  |SanraP10 |
    |marek.bajorek0912@op.pl|Marek     |Bajorek |Kerojab87|
