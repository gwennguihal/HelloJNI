#include "Hello.h"
#include <stdio.h>
#include <stdlib.h>

Hello::Hello(){}

int Hello::giveMeANumber() 
{
   return rand() % 10 + 1;
}