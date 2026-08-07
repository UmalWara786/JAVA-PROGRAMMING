public class Reverse_Array_Concept {
public static void main(String[] args){
//Reverse Array Concept
  
String[] names = {"Umal", "Wara", "Jackson", "Elon"};
  
System.out.println("\"Original Array\"");
//To display  
for (int i=0; i<names.length; i++){
    System.out.println("Name "+(i+1)+" : "+names[i]);
}
System.out.println();
  
System.out.println("\"Reversed Array\"");
//To display  
for(int i=(names.length-1); i>=0; i--){
    //First
    if(i==(names.length-1)){
    System.out.println("Name 1 : "+names[i]);}
    //Second
    if(i==(names.length-2)){
        System.out.println("Name 2 : "+names[i]);}
    //Third
    if(i==(names.length-3)){
        System.out.println("Name 3 : "+names[i]);}
    //Fourth
    if(i==(names.length-4)){
        System.out.println("Name 4 : "+names[i]);}
}        
    }
}
