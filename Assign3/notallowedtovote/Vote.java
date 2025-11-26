import java.util.Scanner;

class NotAllowedToVote extends Exception {
NotAllowedToVote(String message) {
super(message);
}
}


class Vote {
    
void check(int age) throws NotAllowedToVote {
if (age >= 18) {
System.out.println("Thanks for voting");
} else {
throw new NotAllowedToVote("Invalid Age");
}
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your age: ");
int age = sc.nextInt();
Vote v1 = new Vote();
try {
v1.check(age);
} catch (NotAllowedToVote e) {
System.out.println("Not Allowed To Vote");
}
}
}