# Cmd Java2ShellScript

Aplicação que provê comandos de Java para ShellScript.

## As seguintes **funções** estão disponíveis: 

* sin(x)
* cos(x)
* tan(x)
* asin(x)
* acos(x) 
* atan(x)
* atan2(x)
* sqrt(x)
* toRadians(x)
* toDegrees(x)
* pow(x, y)
* random
* log(x)
* log10(x)
* fat(n) ou fatorial(n)
* fib(n) ou fibonacci(n)
* listfib2n(n) ou listfibonacci2n(n)
* listfib2minmax(min, max) ou listfibonacci2minmax(min, max)
* sum(min, max, step) ou summation(min, max, step) ou somatorio(min, max, step)
* prod(min, max, step) ou products(min, max, step) ou produtorio(min, max, step)

OBS: em que x, y são valores double e n é um valor inteiro. 

## As seguintes **constantes** estão disponíveis: 

* PI [PI -c 5]
* E  [E -c 4] 
* PHI [PHI -c 6]

Alguns outros comandos possíveis são: 

* --help ou -h
* --author ou -a 
* --version ou -v
* --commands ou -c

## Exemplo

Exemplo: Crie um arquivo com extensão .sh

```
#!/bin/bash

#armazena em variáveis do ShellScript os valores calculados pelas funções do java.

rad=$(./cmdj2s toRadians 30)
sin=$(./cmdj2s sin $rad)
pi=$(./cmdj2s PI)
soma=$(./cmdj2s sum 1 10 1)

#imprime os valores calculados.

echo "sin(" $i "->" $rad ") = " $sin;
echo "pi = " $pi
echo "soma = " $soma
```

Execute: o arquivo shellscript.

OBS: o arquivo executável cmdj2s (compilado a partir de cmdj2s.c) e o arquivo CmdJava2ShellScript.jar devem estar na mesma pasta ou então devem estar no path do sistema.
