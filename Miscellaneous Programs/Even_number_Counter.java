public class Even_number_Counter {
public static void main(String[] args){
  
//Count Even numbers
int num[] = {1,9,8,2,4,10,8,7};
int count = 0;

System.out.println("\"Counting Even numbers\"");
for(int i=0; i<num.length; i++){
    if(num[i]%2==0){
        count++;
    }
}

System.out.println("Frequency of Even numbers : "+count);
}
}
