@echo off

REM 	This is to compile Java class
REM 	Call cmp <path to file>

javac -d target\classes -cp lib\junit-4.11.jar;lib\hamcrest-core-1.3.jar;target\classes %1