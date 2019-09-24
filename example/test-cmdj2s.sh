#!/bin/bash
#Author: Jesimar da Silva Arantes
#Date: 24/09/2019

echo "cmd java 2 shellscript"

echo "begin"

for i in {0..360..10}; 
do
	
	rad=$(./cmdj2s toRadians $i)
	sin=$(./cmdj2s sin $rad)
	
	#OBS: as quatro linhas abaixo tem o mesmo efeito que as duas linhas acima.
	#cmdrad=$"./cmdj2s toRadians $i"
	#rad=`$cmdrad`
	#cmdsin="./cmdj2s sin $rad"
	#sin=`$cmdsin`;
	
	echo "sin(" $i "->" $rad ") = " $sin;
done

pi=$(./cmdj2s PI)
echo "pi = " $pi

soma=$(./cmdj2s sum 1 10 1)
echo "soma = " $soma

echo "PHI" $(./cmdj2s PHI)
echo "E" $(./cmdj2s E)

echo "end"

