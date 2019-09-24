#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]){
	char param[100] = "";
	for(int i=1; i < argc; i++){
		strcat(param, argv[i]);
		strcat(param, " ");
	}
	char cmd[100] = "java -jar CmdJava2ShellScript.jar ";
	strcat(cmd, param);
	system(cmd);
	return 0;
}


