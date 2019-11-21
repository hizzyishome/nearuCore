Classfile /D:/core/out/production/classes/ppt/PackageDemo.class
  Last modified 2019-11-12; size 630 bytes
  MD5 checksum a9562b7d23c7a7a829bb2a174b0a11a8
  Compiled from "PackageDemo.java"
public class ppt.PackageDemo
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #8.#24         // java/lang/Object."<init>":()V
   #2 = Class              #25            // ppt/BeanDemo
   #3 = Methodref          #2.#24         // ppt/BeanDemo."<init>":()V
   #4 = Fieldref           #26.#27        // java/lang/System.out:Ljava/io/PrintStream;
   #5 = String             #28            // hail hydra
   #6 = Methodref          #29.#30        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #7 = Class              #31            // ppt/PackageDemo
   #8 = Class              #32            // java/lang/Object
   #9 = Utf8               <init>
  #10 = Utf8               ()V
  #11 = Utf8               Code
  #12 = Utf8               LineNumberTable
  #13 = Utf8               LocalVariableTable
  #14 = Utf8               this
  #15 = Utf8               Lppt/PackageDemo;
  #16 = Utf8               main
  #17 = Utf8               ([Ljava/lang/String;)V
  #18 = Utf8               args
  #19 = Utf8               [Ljava/lang/String;
  #20 = Utf8               beanDemo
  #21 = Utf8               Lppt/BeanDemo;
  #22 = Utf8               SourceFile
  #23 = Utf8               PackageDemo.java
  #24 = NameAndType        #9:#10         // "<init>":()V
  #25 = Utf8               ppt/BeanDemo
  #26 = Class              #33            // java/lang/System
  #27 = NameAndType        #34:#35        // out:Ljava/io/PrintStream;
  #28 = Utf8               hail hydra
  #29 = Class              #36            // java/io/PrintStream
  #30 = NameAndType        #37:#38        // println:(Ljava/lang/String;)V
  #31 = Utf8               ppt/PackageDemo
  #32 = Utf8               java/lang/Object
  #33 = Utf8               java/lang/System
  #34 = Utf8               out
  #35 = Utf8               Ljava/io/PrintStream;
  #36 = Utf8               java/io/PrintStream
  #37 = Utf8               println
  #38 = Utf8               (Ljava/lang/String;)V
{
  public ppt.PackageDemo();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 8: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lppt/PackageDemo;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: new           #2                  // class ppt/BeanDemo
         3: dup
         4: invokespecial #3                  // Method ppt/BeanDemo."<init>":()V
         7: astore_1
         8: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
        11: ldc           #5                  // String hail hydra
        13: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        16: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
        19: aload_1
        20: pop
        21: ldc           #5                  // String hail hydra
        23: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        26: return
      LineNumberTable:
        line 10: 0
        line 11: 8
        line 12: 16
        line 13: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  args   [Ljava/lang/String;
            8      19     1 beanDemo   Lppt/BeanDemo;
}
SourceFile: "PackageDemo.java"
