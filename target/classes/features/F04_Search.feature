@smoke
  Feature: search functionality
    Scenario Outline: Scenario Outline 1 user could search using product name
      Given user can search <search> in search field
      Then search should be successful
      Examples:
        | search |
        | book   |
        | laptop |
        | nike   |

      @smoke
      Scenario Outline: user could search for product using sku
        Given user can search <search> in field
        Then searching successfully
        Examples:
          | search    |
          | SCI_FAITH |
          | APPLE_CAM |
          | SF_PRO_11 |

