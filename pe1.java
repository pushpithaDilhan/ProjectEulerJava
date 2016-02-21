public class pe1{
public static void main(String args[]){
int s=0;
for(int a=1; a<1000 ;a++)
{
if((a%3==0) || (a%5==0)){
s+=a;
}
}
System.out.println("The sum is :"+s);
}
}