@smoke
  Feature: hover functionality
    Scenario: user can select from categories
      Given user select computer from categories
      And user select Desktops from sub_categories
      Then The sub_category will open successfully