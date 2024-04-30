@smoke
Feature: F07_followUs | users could open followUs links
  Scenario: user opens facebook link
 Given user opens facebook link
  Then facebook will open in new tab
  Scenario: user opens twitter link
  Given user opens twitter link
  Then twitter will open in new tab
  Scenario: user opens youtube link
  Given user opens youtube link
  Then youtube will open in new tab
 Scenario: user opens rss link
  Given user opens rss link
  Then rss will not open in new tab