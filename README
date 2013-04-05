Assuming you have Ant & Ivy installed & configured, a simple "ant" in the route directory
should build a deployable WAR (including a compiled theme, and a compiled widgetset) in build\sample-application.war

The following should illustrate cloneing the repository, and

	D:\Temp>git clone https://github.com/canthony/simple-vaadin-7-compile-widgetset-ivy.git
	Cloning into 'simple-vaadin-7-compile-widgetset-ivy'...
	remote: Counting objects: 28, done.
	remote: Compressing objects: 100% (20/20), done.
	remote: Total 28 (delta 3), reused 28 (delta 3)
	Unpacking objects: 100% (28/28), done.

	D:\Temp>cd simple-vaadin-7-compile-widgetset-ivy

	D:\Temp\simple-vaadin-7-compile-widgetset-ivy>ant
	Buildfile: D:\Temp\simple-vaadin-7-compile-widgetset-ivy\build.xml
	[ivy:resolve] :: Apache Ivy 2.3.0 - 20130110142753 :: http://ant.apache.org/ivy/ ::
	[ivy:resolve] :: loading settings :: url = jar:file:/C:/Users/Charles/.ant/lib/ivy-2.3.0.jar!/org/apache/ivy/core/settin
	gs/ivysettings.xml
	[ivy:resolve] :: resolving dependencies :: com.example#v7proj;working@PC167
	[ivy:resolve]   confs: [default, widgetset-compile]
	[ivy:resolve]   found com.vaadin#vaadin-server;7.0.2 in public
	[ivy:resolve]   found com.vaadin#vaadin-shared;7.0.2 in public
	[ivy:resolve]   found com.vaadin#vaadin-shared-deps;1.0.2 in public

	[...]

	[ivy:resolve]   found commons-codec#commons-codec;1.3 in public
	[ivy:resolve]   found commons-io#commons-io;1.4 in public
	[ivy:resolve]   found commons-lang#commons-lang;2.6 in public
	[ivy:resolve]   found org.apache.james#apache-mime4j;0.6 in public
	[ivy:resolve] :: resolution report :: resolve 628ms :: artifacts dl 22ms
	        ---------------------------------------------------------------------
	        |                  |            modules            ||   artifacts   |
	        |       conf       | number| search|dwnlded|evicted|| number|dwnlded|
	        ---------------------------------------------------------------------
	        |      default     |   14  |   0   |   0   |   0   ||   16  |   0   |
	        | widgetset-compile|   26  |   0   |   0   |   0   ||   28  |   0   |
	        ---------------------------------------------------------------------

	-init:
	    [mkdir] Created dir: D:\Temp\simple-vaadin-7-compile-widgetset-ivy\build
	    [mkdir] Created dir: D:\Temp\simple-vaadin-7-compile-widgetset-ivy\build\work

	-compile-theme-1:
	    [mkdir] Created dir: D:\Temp\simple-vaadin-7-compile-widgetset-ivy\build\work\VAADIN\themes\example

	-compile-theme-2:

	compile-theme:

	compile-project:
	    [mkdir] Created dir: D:\Temp\simple-vaadin-7-compile-widgetset-ivy\build\work\WEB-INF\classes
	    [javac] Compiling 4 source files to D:\Temp\simple-vaadin-7-compile-widgetset-ivy\build\work\WEB-INF\classes
	[...]
	package-war:
	    [mkdir] Created dir: D:\Temp\simple-vaadin-7-compile-widgetset-ivy\build\work\WEB-INF\lib
	     [copy] Copying 16 files to D:\Temp\simple-vaadin-7-compile-widgetset-ivy\build\work\WEB-INF\lib
	      [war] Building war: D:\Temp\simple-vaadin-7-compile-widgetset-ivy\build\sample-application.war

	build-and-package:

	BUILD SUCCESSFUL
	Total time: 1 minute 47 seconds

Hard to illustrate, but you can simply deploy the war; here, I'm using (Winstone)[https://code.google.com/p/winstone/]

  D:\Temp\simple-vaadin-7-compile-widgetset-ivy>java -jar c:\Users\Charles\Downloads\winstone-1.0.5-boot.jar build\sample-application.war
  Fri, 5 Apr 2013 13:14:30 540 GMT, BootStrap Info: Home Directory=C:\Users\Charles\Downloads
  Fri, 5 Apr 2013 13:14:30 557 GMT, BootStrap Info: Main-Class=net.winstone.Winstone
  INFO  05/04/13 14:14:30.703 [main]: stage 1/3: Loading arguments...
  INFO  05/04/13 14:14:30.704 [main]: stage 2/3: check embedded file...
  INFO  05/04/13 14:14:30.705 [main]: no embedded file was found
  INFO  05/04/13 14:14:30.706 [main]: stage 3/3: compute JSP classpath...
  INFO  05/04/13 14:14:30.735 [main]: Beginning extraction from war file
  INFO  05/04/13 14:14:31.048 [main]: Found and enabled the local Servlet 2.5 XSD replacement
  INFO  05/04/13 14:14:31.207 [main]: Deploy web application: prefix [] webroot [D:\Temp\Charles\winstone\Charles\default\
  sample-application.war]
  INFO  05/04/13 14:14:31.249 [main]: HTTP Listener started: port=8080
  INFO  05/04/13 14:14:31.288 [main]: AJP13 Listener started: port=8009
  INFO  05/04/13 14:14:31.291 [LauncherControlThread[ControlPort=-1]]]: Winstone Servlet Engine v1.0.3 running: controlPor
  t=disabled
  Fri, 5 Apr 2013 13:14:31 291 GMT, BootStrap Info: Exit
  Apr 05, 2013 2:14:38 PM com.vaadin.server.DefaultDeploymentConfiguration checkProductionMode
  WARNING:
  =================================================================
  Vaadin is running in DEBUG MODE.
  Add productionMode=true to web.xml to disable debug features.
  To show debug window, add ?debug to your application URL.
  =================================================================