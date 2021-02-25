package ejercicio3;

public class Jarra {

		private double jarraA=0;
		private double jarraB=0;
		private double litrosGastados=0.0;
		
		public Jarra() {
		}
		public Jarra(double jarraA, double jarraB) {
			this.jarraA=jarraA;
			this.jarraB=jarraB;
		}
		
		public int llenarJarraA() {
			if(jarraA==0) {
				this.jarraA=this.jarraA+7;
			}
			else {
				System.out.println("La jarra ya esta llena");
			}
			
			return (int) jarraA;
		}
		
		public int llenarJarraB() {
			this.jarraB=this.jarraB+4;
			return (int) jarraB;
		}
		
		public int vaciarJarraA() {
			this.jarraA=0;
			return (int) jarraA;
		}
		
		public int vaciarJarraB() {
			this.jarraB=0;
			return (int) jarraB;
		}
		
		public String vaciarAEnB() throws Exception {
			if (jarraA<=4 && jarraB==0) {
				jarraB=jarraB+jarraA;
				jarraA=jarraB-4;
			}
			else {
				throw new Exception ("No hay suficiente espacio para llenarla");

			}
			return "La jarra A tiene un total de " + jarraA + " L y la jarra B tiene un total de " + jarraB + " L";
		}
		
		public String vaciarBEnA() throws Exception {
			if (jarraA<3 && jarraB<=4 && jarraA>=0) {
				jarraA=jarraB+jarraA;
				jarraB=0;
			}
			else {
				throw new Exception ("No hay suficiente espacio para llenarla");

			}
			return "La jarra A tiene un total de " + jarraA + " L y la jarra B tiene un total de " + jarraB + " L";
		}
		
		
		
		
		
		public double getJarraA() {
			return jarraA;
		}
		public void setJarraA(double jarraA) {
			this.jarraA = jarraA;
		}
		public double getJarraB() {
			return jarraB;
		}
		public void setJarraB(double jarraB) {
			this.jarraB = jarraB;
		}
		
		
		
}
