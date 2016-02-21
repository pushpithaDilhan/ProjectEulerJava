public class pe9{
public static void main(String[] args){

for(int b=1;b<1000;b++){
  for(int a=1;a < b;a++){
    if(a+b+Math.sqrt(a*a+b*b) == 1000){
         System.out.println((int)(a*b*Math.sqrt(a*a+b*b)));
         break;
    }
  }
}

}
}