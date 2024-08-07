# JAVA-Series Notes:

## LTS (Long Term Support) -> Java SE 21
- Go to Oracle -> "java.sun.com" to download the java version.
- Always Install Java version for development with LTS in it.
-----
## Best IDE for Java:
- IntelliJ
- Eclipse
-----
## Windows Installation:
- Supports Windows 10 and above with 64 bit
- install recent Java LTS version available with x64 installer

Note: Keep note of the installation path of Java.
-----
## Mac Installation:
- If using Apple M Series Chips:
    - install recent Java LTS version available with ARM 64 DMG installer

- If using intel Chips:
    - install recent Java LTS version available with x64 DMG installer
-----
## Confirm installation:
- On Windows:
    - Press windows + R (or) type "run" in cmd (command prompt)
    - type java -version

- On Mac:
    - Open terminal
    - type java -version
-----
## JShell
- REPL => Read Eval Print Loop
- Documentation: https://docs.oracle.com/en/java/javase/21/jshell/introduction-jshell.html
- type "JShell" on terminal to invoke the JShell functionality
- type "/help intro" on terminal i.e. gives the intro into JShell
- type "/help" to find all the commands in JShell.
-----
## Installation of IntelliJ:
- Download (community version): https://www.jetbrains.com/idea/download/
- Ultimate version is not free
- On Windows:
    - .exe (community version)
    - Create Desktop option checked
- On Mac:
    - .dmg (intel) / .dmg (apple silicon) (community version)
    - Create Desktop option checked
-----
## Creating new project:
- File -> New (New Project) or Click New Project Icon
- Validate the location, language, build system & JDK version
- Click customize option from homepage or File -> Manage IDE Settings -> Settings Sync
    - Appearance & Behaviour:
        - Appearance:
            - Theme
    - Editor:
        - General:
            - Auto Import:
                - Check "Add unambiguous import on the fly"
                - Check "Optimize import on the fly"
            - Code Folding:
                - Uncheck File Header (Under General)
                - Uncheck Imports (Under General)
                - Uncheck One-line methods (Under Java)
                - Uncheck Closures (Under Java)
                - Uncheck Generic constructors & method parameters (Under Java)
            - Appearance:
                - Check Show line numbers
- Apply all the changes & Save.
- Do not have spaces in project name
-----
## File creation under project
- The class name and the file name should be same
-----
## If windows installation of JDK did not work:
Try this:
- Go to "System Properties" (Can be found on Control Panel > System and Security > System > Advanced System Settings)
- Click on the "Environment variables" button under the "Advanced" tab
- Then, select the "Path" variable in System variables and click on the "Edit" button
- Click on the "New" button and add the path where Java is installed, followed by \bin. By default, Java is installed in C:\Program Files\Java\jdk-11.0.1 (If nothing else was specified when you installed it). In that case, You will have to add a new path with: C:\Program Files\Java\jdk-11.0.1\bin
- Then, click "OK", and save the settings
- At last, open Command Prompt (cmd.exe) and type java -version to see if Java is running on your machine
-----
## If not using an IDE then perform the below steps to run the java program
- javac Main.java (Main.java is the file and also the class "Main")
- java Main
-----
## Code Comparison in IntelliJ
### Method 1:
- Download the zip file of other user's code 
- Right-click the file we need to compare on intelliJ
- Select "Compare With" option and navigate to the downloaded file folder and open
- left side is current file & right side is downloaded file
- ">>" to update the downloaded file (right-side) with current file (left-side) changes and "<<" is vice versa.
### Method 2:
- Right-click the code file and select Local History -> Show History option
- Once opened the Local History, right-click the files versions on the left side and select revert option to make necessary changes
-----
## Debugging in IntelliJ:
- Right-click the code file and select debug option.
- Click near the line number of the code file enabling the breakpoints by red dots indicating.
- Play, Pause, Step Over, Step Into, Step Out
-----