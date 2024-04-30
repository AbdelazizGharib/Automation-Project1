@smoke
  Feature: Wishlist Feature
    Scenario: user can use Wishlist
      Given click  choose HTC from  wishlist  button
      Then success Green message will appear
      Scenario: user  handle success message and check Qty
        Given user click on HTC category
        Then check The Qty on wishlist

