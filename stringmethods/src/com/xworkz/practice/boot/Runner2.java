package com.xworkz.practice.boot;


public class Runner2 {

	public static String movie="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
			
	public static void main(String[] args) {
System.out.println("splitting all  by space");

   String[] splitted= movie.split(" ");
 
 
   int index=0;
 
 
while(index<splitted.length)
   {
	  System.out.println(splitted[index]); 
	  index++;
   }
System.out.println("splitted using , ");
String[] split=movie.split(",");
for (String w : split) {  
   System.out.println(w);  

} 
System.out.println(split.length);
	System.out.println("printing digits in a given string");
char[] array=movie.toCharArray();
 StringBuilder s=new StringBuilder();
 for(char c:array)
 {
	 if(Character.isDigit(c))
	 {
		 s.append(c+" ");
	 }
	
	 
 }
 System.out.println(s);
 System.out.println("converting string in to an array");
 char[]ch=movie.toCharArray();
 System.out.println(ch.length);
 System.out.println(movie.length());
for(int cat=0;cat<ch.length;cat++) 
{
     System.out.println(ch[cat]);
	
	

	}

System.out.println("reversing the given string");
StringBuilder b=new StringBuilder();
System.out.println(b.reverse());
System.out.println("uppercase");
System.out.println(movie.toUpperCase());
System.out.println("lower case");

System.out.println(movie.toLowerCase());



}
}