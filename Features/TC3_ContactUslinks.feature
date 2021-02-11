Feature: Contact us
  Scenario: Verify links on contact page
    Given I navigate to the Pwc Digital Pulse
    When I select contact us from the burger menu
    Then I am taken to the contact us page
    And I am presented with the below options for contacts
      | Heading                         | Contact Link                                 |
      | PwC Digital Services            | https://digital.pwc.com/en/contact-us.html   |
      | Digital Pulse editorial team    |                                              |
      | Careers at PwC                  | https://www.pwc.com/gx/en/careers.html       |
      | General enquiries               | https://www.pwc.com/gx/en.html               |