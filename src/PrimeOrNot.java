import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String [] Args) {
String number = JOptionPane.showInputDialog("Choose a number");
int Number = Integer.parseInt(number);

for(int x =  2; x < Number; x++) {
if(Number%x == 0) {
	JOptionPane.showMessageDialog(null, "Not Prime");
	System.exit(0);
}
}
JOptionPane.showMessageDialog(null, "Prime");

}
}