#include<jni.h>
#include<HelloWorld.h>
#include<stdio.h>
#include<windows.h>



JNIEXPORT void JNICALL Java_HelloWorld_hello(JNIEnv *e, jclass obj)
{
	
	printf("Hello");
	
	
}

