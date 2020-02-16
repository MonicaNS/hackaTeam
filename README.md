# hackaTeam

Finding teammates for a Hackathon is usually even harder than the Hackathon itself, especially when you're a new hacker and your skill level does not match. 
Our solution to this problem was to create a skill based matching algorithmic mobile application to match various skills of Hackathon participants to one another. Those who have ideas can submit them and choose people to join their team. While those who want to join a team can submit their skills, personal interests, and previous projects in order to find potential teams.

We built a three - tier mobile application on Android using Java as the front end, Firebase and Azure MySQL databases, and  wrote our own PHP / node.JS APIs to connect them.
We had a difficult time connecting servers (Microsoft Azure) to the Android front end. We couldn't get the data moving from back to front, until trying Google Firebase and then ran out of time to learn it.

We are all first time hackers coming from SJSU and we had an amazing time in this environment. We learned so much about front end development using Java and integrating it with database servers.
In the future we plan on adding more functionality for the user and fully connecting a database of our choice with the front end.

To run the application:
1. Clone the github repo into your favorite Android IDE (we used Android Studio). Build and run for the front end to work.
2. Set up a database such as Google's Firebase or Microsoft's Azure. 
    - For Firebase you would add your own application ID under build.gradle (application level) and use their API
    example: applicationId "com.example.hackateam"
    - For Azure you would set up a server and connect using PHP requests, in order to connect to the data base have
    example: $con=mysqli_connect("PROJECT.mysql.database.azure.com","NAME@HOST","PASSWORD!","DATABASE");
    Then write SQL queries using PHP  
    example: $sql = "Insert into login (email, password) values ('$name', '123')";
