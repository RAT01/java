class SortData {
int n,temp,i,j;
public void asec(int num[]) {
for (int i = 0; i < num.length; i++) {
for (int j = i+1; j < num.length ; j++) {
if(num[i]>num[j]) {
temp= num[i];
num[i]=num[j];
num[j]=temp;
}
}
}
System.out.println("Assending Order");
for (int i = 0; i < num.length ; i++) {
System.out.println(num[i]+" ");
}
}
public void desc(int num[]) {
for (int i = 0; i < num.length; i++) {
for (int j = i+1; j < num.length ; j++) {
if(num[i]<num[j])
{
temp= num[i];
num[i]=num[j];
num[j]=temp;
}
}
}
System.out.println("Descending Order");
IT21063
for (int i = 0; i < num.length ; i++) {
System.out.println(num[i]+" ");
}
}
}
class main {
public static void main(String[] args) {
SortData obj=new SortData();
int arr[]={13,22,27,11,4};
obj.asec(arr);
obj.desc(arr);
}
}
