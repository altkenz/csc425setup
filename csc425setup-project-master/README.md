# Setup Practice Project

The purpose of this project is to give you a chance to practice with
the tools we will be using during this semester and the process
of checking out, completing, and submitting solutions.

**Note**: The assignment must be completed in the specific manner 
described in the instructions. Any deviations from the instructions 
will possibly cause the automated grading to fail and will be considered 
incorrect. Following the instructions includes, but is not limited to:

* Do not change the test code in any way. If the test code does not compile, change your implementation of the classes being tested, not the tests! (you may add additional tests)
* Do not modify interfaces and abstract classes provided to you in any way unless specifically instructed to do so.
* Do not modify class constructors, method signatures, or local field names unless specifically instructed to do so.
* Do not add fields to any classes unless specifically instructed to do so.

## Note About Academic Honesty

You should keep your code and repositories private and should not be 
sharing code under any circumstances. **When forking your projects, 
you should make sure the repository is set to private and you should 
immediately remove the class's team CSC425 from your project** so that 
I will be the only person who can access your code other than you! 
If you do not do this and check in large amounts of code, I will 
consider this a violation of the academic honesty policies of MSU.

## Instructions

### Forking

The first thing you must do is create your own copy of this project.
To do this, you should click the **fork** button near the top, right
of the page. 

*This fork will, by default, be accessible to your
classmates. As noted above, if you do not change this and submit
work, it will be considered academic dishonesty.*

Accordingly, the next step would be to go to the project settings
and remove the class team (**CSC425**) from your project. Make sure
that I (**pwright4**) am still listed as a collaborator, or else
I will not be able to access and grade your code.

### Cloning

Once you have created your own fork of this project, you need to get
it copied to your local machine. To do this, you should use either
a command line git client or a git client built into your IDE of
choice. Whichever you choose, you will want to **clone** the
project to get your local project.

### Building

Once you have a copy of your code, you will want to import it into
your editor of choice. I would recommend using IntelliJ, Eclipse or
NetBeans, as they will have built in support for everything you need
to do. Once your project is imported, you will need to use **maven**
to build the code. Maven will download any necessary third party
libraries, configure your classpath and compile the project.

In this particular case, you will see that the build fails, because
the project contains errors!

### Fix The Code

You should use the feedback from maven and from your IDE to determine
what is wrong with your code. Attempt to fix your code and rebuild
with maven.

### Check Tests

Making the code compile and making the code correct are not the
same thing! Accordingly, you should check the output of maven
and confirm that all tests have passed. You can also launch tests
from your IDE directly. Once the test is passing, you can be
reasonably sure that the code is correct.

### Run Application

We have also included an *Application* class which can be launched.
For practice, go ahead and try to run this class from your IDE and
confirm that it does what you would expect based on the code.

### Add/Commit/Push

Once you are confident that your work is done, you will need to
use your git client to *add* the changes you made to be staged
for the next commit, then *commit* the changes you have staged.

At this point, you have created a new snapshot of your project,
but it still only exists on your local machine. To make sure
your changes are submitted, you should now *push* your code
back to the server.

### Confirm Push

Just to be safe, you should probably log into the web UI and
confirm that all of the changes (you think) you just pushed
actually made it to the server. If your code is on the GitHub
server, then my scripts will find it at the deadline.

### Submit Output on Canvas

To confirm that you did indeed use maven, you need to submit the
text from your successful maven run on Canvas.

## Extra

If you would like some extra comfort that you have actually
submitted all of your changes, you can experiment with Travis CI,
which will download your code and execute maven on it every time
you make a commit. If your tests pass there, your tests will
pass on my machine as well!
