package testimine_talvik_anita;

public class Testimine_Talvik_Anita_1 {

public static int countMultiplesOfThree(int A, int B) {
if (A > B) {
return 0;
}
int count = 0;
for (int i = A; i <= B; i++) {
if (i % 3 == 0) {
count++;
}
}
return count;
}
}
