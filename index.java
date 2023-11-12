import java.util.Scanner;
public class index {

public static void main(String[] args) {
  int nbre=0;  
Scanner sc= new Scanner(System.in);

System.out.print("entrer le nombre entier superieur à 1 :");

nbre= sc.nextInt();

int sum=0;

for(int i = 0;i <= nbre ;++i){

sum +=i;
}

System.out.println("l entier est "  + nbre + " la somme est  " + sum);
}
}