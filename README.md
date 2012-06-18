Simple tycho example
[![Build Status](https://buildhive.cloudbees.com/job/xseignard/job/tycho-demo-camp/badge/icon)](https://buildhive.cloudbees.com/job/xseignard/job/tycho-demo-camp/)

How to
--------------
You can run **mvn clean install** in the parent folder.

There is a profile that enables the execution of the integration tests with SWTBot. 

To enable it just run **mvn clean install -Prun-its**

To see Sonar quality analysis, install a Sonar instance and run the following commands.

    mvn clean install -Prun-its

and then 

    mvn sonar:sonar -Prun-its




