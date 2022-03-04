# Social Networking Platform Kata
This assessment creates a version of a social networking platform in which users can create posts, all of which are aggregated in their personal timeline. Currently, users have the ability to post and check their posts in a feed. The next steps are to implement a credential system for user registration and authentication (user accounts are currently able to be created without the use of credentials), and implement a follower system, where users can view other users' timelines.

## Building the Project
The *.java* files contain the Post class and User class, and their test class counterparts, all of which can be compiled in any IDE that supports Java.

Upon creation of a new User, a folder for the user is created in the current system directory containing two file: *timeline.json* and *wall.json*. The first of these files contains a JSON array that will hold a sequence of JSON objects, with each object encapsulating a Post; it is the user's personal timeline. In the current version, the file is overwritten whenever a new post is created under the specific user; the new result is the array with one or more JSON objects, depending on how many posts were created.

The second file, *wall.json*, is similar to *timeline.json* in that it will hold a JSON array of objects but will aggregate all posts from all timelines from the other users that the current user is following (including their own).
