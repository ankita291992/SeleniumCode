class Rocket {
 //private void blastOff() { System.out.print("bang "); }
}
public class Shuttle extends Rocket {
 public static void main(String[] args) {
 new Shuttle().go();
 }
 void go() {
 blastOff();
 // Rocket.blastOff(); // line A
 }
 private void blastOff() { 
	 String s="java";
	 StringBuilder sb=new StringBuilder("hi");
	 
	 System.out.print("sh-bangritjijti "); 
	 System.out.print("sh-bangr ");	 
 }
 
}