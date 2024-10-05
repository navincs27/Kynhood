Feature: Kynhood Application Validation

@Smoke
Scenario: Verify the location details of the home feed contents
Given User visit the Home page "https://kynhood.com"
When User scroll through the Home feed contents
Then User validate the location mapped to these contents is either "Anna Nagar" or "Mylapore" or "T Nagar"
And User validate the thumbnail of each of these contents

@Sanity
Scenario: Verify the contents of the first two or three klips
When User click on the klips screen
Then User validate the title and user profile name of the first two or three klips

@Smoke @Sanity
Scenario: Verify the videos listed inside "watch more" is from that specific category
When User navigate to the Videos tab
And User select View all of any category
Then User scroll through the video contents
And User validate that all of listed videos are from the same category