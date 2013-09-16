@echo off

REM   This is to run JUnit test from console
REM   Call test.bat <test class name>

java -cp lib\junit-4.11.jar;lib\hamcrest-core-1.3.jar;target\classes org.junit.runner.JUnitCore %1