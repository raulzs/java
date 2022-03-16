:loop
set/p archivo= Nombre del archivo java :
javac *.java
java Main_%archivo%
pause > null
goto :loop