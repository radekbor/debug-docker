# debug-docker
Simple spring app which can be configured to debug via intellij debuger.

To connect your intellij with docker you need to select "Remote" option.

Then you need yo check "Socket" and "Attach", type also appropriate port which was used in Dockerfile: 8000.

![Configuration in Intellij](https://github.com/radekbor/debug-docker/blob/master/intelij-configuration.png)

Eventually you can play with these options in intellij, then you will get value in area:
"Command line argument for running remote JVM". You can replace your dockerfile configuration with that.

