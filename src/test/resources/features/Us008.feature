@US_08 @SmokeTest @hata
Feature: US_08 Password segment on Homepage should be editable

  Background: us08 user enters gmibank homepage then reaches password menu link
    Given us08 user enters gmibank homepage
    Then us08 user clicks userEntry icon
    Then us08 user clicks signIn link
    Then us08 user enters admin username "team21user"
#  USER1
    Then us08 user enters admin password "team21User"
#  User123_
    Then us08 user clicks signIn button
    Then user clicks password link


  @TC_0801
  Scenario: The old password should not be used
    Given user clicks password link and old password for three textbox "team21User"
#    User123_
    Then user doesn't save
    Then user signOut


  @TC_0802
  Scenario: There should be at least 1 uppercase char for stronger password
    Given  user clicks password link and writes one random uppercase
    Then user writes six lower cases and sees the change of password scales
    Then user writes six digits and sees the change of password scales
    Then user writes six special chars and sees the change of password scales
    Then user signOut

  @TC_0803
  Scenario: There should be at least 1 lowercase char for stronger password
    Given user clicks password link and writes one random lowercase
    Then 0user writes six digits and sees the change of password scales
    Then user writes six upper cases and sees the change of password scales
    Then user writes  six special chars and sees the change of password scales
    Then user signOut

  @TC_0804
  Scenario: There should be at least 1 digit char for stronger password
    Given testcasefour user clicks password link and writes one random digit
    Then testcasefour user writes six upper cases and sees the change of password scales
    Then testcasefour user writes six special chars and sees the change of password scales
    Then testcasefour user writes six lower cases and sees the change of password scales
    Then user signOut

  @TC_0805
  Scenario: There should be at least 1 special char for stronger password
    Given testcasefive user clicks password link and user writes one random special character
    Then testcasefive user writes six lower cases and sees the change of password scales
    Then testcasefive user writes six upper cases and sees the change of password scales
    Then testcasefive user writes six digits and sees the change of password scales
    Then user signOut

  @TC_0806
  Scenario: There should be at least 7 chars for a stronger password
    Given user clicks password link and writes one random uppercase, lowercase, digit and special char
    And user writes two lower cases and doesn't see the change of password scales
    And user write one more lower cases and sees to changing
    And user writes two upper cases and doesn't see the change of password scales
    And user write one more upper cases and sees to changing
    And user writes two digits and doesn't see the change of password scales
    And user write one more digits and sees to changing
    And user writes two special chars and doesn't see the change of password scales
    Then user write one more special chars and sees to changing
    Then user signOut

  @TC_0807
  Scenario: The new password should be confirmed
    Given user clicks password link and writes random password
    Then user saves new password
    Then user signOut


