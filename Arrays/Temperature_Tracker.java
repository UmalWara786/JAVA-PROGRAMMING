//This program stores the teperature of 7 days in an array and print temperature for each day by using loop

public Temperature_Tracker {
public static void main(String[] args){
//Temperature Tracker
 float[] Temp = {27.5f, 30.2f, 29.8f, 45f, 42.4f, 30.23f, 29.8f};
  
 System.out.println("\"Temperature Tracker\"");
 for (int i=0; i<Temp.length; i++){
     System.out.println("Day "+(i+1)+ " Temperature : "+Temp[i]+" Degree");
 }  
  }
}
