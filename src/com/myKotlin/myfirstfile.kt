@file:JvmName("MyCustomKotlinFileName")

package com.myKotlin

import com.myjava.MyJavaFile

fun main(args: Array<String>) {

 var area = MyJavaFile.getArea(10,9)
    println(" printing area from kotlin file : $area ")

}

fun add ( a :Int , b :Int) : Int{

    return a + b
}

 /*
 * pubic class MyCustomKotlinFileName {
 *
 *
 *   public static void com.myKotlin.main(String [] args ) {
 *
 *
 *         }
 *
 *    public static Int com.myKotlin.add (int a ,int b){
 *
 *    }
 *
 *
 * }
 *
 *
 *
 *
 *
 * */




