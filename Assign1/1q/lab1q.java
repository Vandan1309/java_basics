import java.util.Scanner;
class lab1q{
public static void main(String args[]){
int i;
int j;



int[][] s1={ {1,2,3},{4,5,6},{7,8,9} };
System.out.println("First Matrix");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print(s1[i][j]);
}
System.out.println("\n");
}
int r=3;
int c=3;


int[][] s2={ {3,2,1},{6,5,4},{9,8,7} };
System.out.println("Second Matrix");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print(s2[i][j]);
}
System.out.println("\n");
}

int[][] s3= new int[r][c];
System.out.println("Added Matrix");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
s3[i][j]=s1[i][j]+s2[i][j];
}
}
for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print(s3[i][j]);
}
System.out.println("\n");
}

}
}
