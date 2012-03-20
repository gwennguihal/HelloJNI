#include "HelloJNI.h"
#include "myGreatLib/Hello.cpp"

#ifdef ANDROID
#include <android/log.h>
#endif

JNIEXPORT jint JNICALL Java_fr_myrddin_hellojni_HelloJNI_jniGiveMeANumber(JNIEnv *, jobject)
{
	Hello hello;
	return hello.giveMeANumber();
}

