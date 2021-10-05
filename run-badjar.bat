call .\setenv.bat
echo Ensure build.xml has been invoked and verify\badjar.jar exists
pause
call java -jar verify\badjar.jar